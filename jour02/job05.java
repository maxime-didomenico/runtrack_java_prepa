import java.util.Scanner;

public class job05 {
    public static void main(String[] args) {
        int input;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        input = scanner.nextInt();

        if (input < 16) {
            System.out.println("You are too young to work.");
        }
        if (input >= 16 && input <= 55) {
            System.out.println("You can work.");
        }
        if (input > 55 && input < 67) {
            System.out.println("You cant work.");
        }
        if (input >= 67) {
            System.out.println("You are retired well done.");
        }
    }
}