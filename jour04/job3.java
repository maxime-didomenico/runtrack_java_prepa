/*

    La différence réside dans le fait que l'on utilise deux threads et non
    0 ou un si l'on a pas utilisé ma technique pour calculer le temps
    d'execution.
    Ainsi le programme devrait fonctionner 2 fois plus vite. (à peu près)

*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

public class job3 {
    public static void main(String[] args) throws InterruptedException {
        long start, end, total;
        int length, halfLength;

        start = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the string :");
        length = scanner.nextInt();
        scanner.close();

        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);
        ReentrantLock lock = new ReentrantLock();

        halfLength = length / 2;

        Thread thread1 = new Thread(() -> {
            int i = 0;
            while (i < halfLength) {
                int index = random.nextInt(characters.length());
                char randomChar = characters.charAt(index);
                lock.lock();
                try {
                    stringBuilder.append(randomChar);
                } finally {
                    lock.unlock();
                }
                i++;
            }
        });

        Thread thread2 = new Thread(() -> {
            int j = halfLength;
            while (j < length) {
                int index = random.nextInt(characters.length());
                char randomChar = characters.charAt(index);
                lock.lock();
                try {
                    stringBuilder.append(randomChar);
                } finally {
                    lock.unlock();
                }
                j++;
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        String randomString = stringBuilder.toString();

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(randomString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        end = System.currentTimeMillis();
        total = end - start;

        System.out.println("the random string character is written in the output.txt.");
        System.out.println("Global execution time : " + total + " ms.");
    }
}