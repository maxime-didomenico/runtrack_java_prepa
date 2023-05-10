import java.util.Scanner;

public class job07 {
    public static void main(String[] args) {
        int result = 1, n;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println(n + " factorial is : " + result);
    }
}