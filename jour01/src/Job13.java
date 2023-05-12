import java.util.Scanner;

public class Job13 {
    public static void main(String[] args) {
        int num, i = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        num = scanner.nextInt();

        while (i < num) {
            i += 1;
            System.out.println(i);
        }
    }
}