import java.util.Scanner;

public class job10 {
    public static void main(String[] args) {
        int num, last, first;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        num = sc.nextInt();
        last = num % 10;
        first = num;
        while (first >= 10) {
            first /= 10;
        }
        System.out.println("The first digit of " + num + " is : " + first);
        System.out.println("It last digit is : " + last);
    }
}