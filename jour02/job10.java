import java.util.Scanner;

public class job10 {
    public static void main(String[] args) {
        int num, buff, res = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        num = sc.nextInt();
        buff = num;
        while (buff != 0) {
            res += buff % 10;
            buff /= 10;
        }
        System.out.println("The result for " + num + " is : " + res);
    }
}