import java.util.Scanner;

public class job03 {
    public static void main(String[] args) {
        int i = 0, input;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        input = scanner.nextInt();

        while (i < 10) {
            i += 1;
            System.out.println(input + " x " + i + " = " + (input * i));
        }
    }
}