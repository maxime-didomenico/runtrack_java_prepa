import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class job2 {
    public static void main(String[] args) {
        long start, end, total;
        int length, index, i = 0;
        char randomChar;

        start = System.currentTimeMillis();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the string :");
        length = scanner.nextInt();
        scanner.close();

        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(length);

        while (i < length) {
            index = random.nextInt(characters.length());
            randomChar = characters.charAt(index);
            stringBuilder.append(randomChar);
            i++;
        }

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