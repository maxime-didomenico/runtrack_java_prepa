import java.util.Scanner;

public class job4 {
    public static void main(String[] args) {
        long start, end, total;
        int num, i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number :");
        num = scanner.nextInt();
        scanner.close();
        System.out.println();

        start = System.currentTimeMillis();
        while (i < num) {
            i++;
        }

        end = System.currentTimeMillis();
        total = end - start;

        System.out.println("Total count : " + i);
        System.out.println("Time : " + total + " ms.");
    }
}