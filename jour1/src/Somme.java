import java.util.Scanner;

public class Somme {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        num1 = scanner.nextInt();
        System.out.print("Please enter a number : ");
        num2 = scanner.nextInt();

        System.out.println("result = " + (num1+num2));
    }
}