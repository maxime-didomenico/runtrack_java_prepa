import java.util.Scanner;

public class job8 {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        final int[] sum1 = {0};
        final int[] sum2 = {0};
        long start, end, total;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the tab size : ");
        int size = scanner.nextInt();
        int[] tab = new int[size];
        System.out.println("Please fill the tab : ");

        while (i < size){
            tab[i] = scanner.nextInt();
            i++;
        }
        scanner.close();

        start = System.nanoTime();

        Thread thread1 = new Thread(() -> {
            int j = 0;
            while (j < (size/2)){
                try {
                    sum1[0] += tab[j];
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.print("error.");
                    break;
                }
                j++;
            }
        });

        Thread thread2 = new Thread(() -> {
            int j = (size / 2);
            while (j < size){
                try {
                    sum2[0] += tab[j];
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.print("error.");
                    break;
                }
                j++;
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        end = System.nanoTime();
        total = end - start;

        System.out.println("Total :  " + (sum1[0] + sum2[0]));
        System.out.println("Time : " + total + " ms.");
    }
}