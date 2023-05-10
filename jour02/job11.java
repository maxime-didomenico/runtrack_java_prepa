import java.util.Scanner;

public class job11 {
    public static void main(String[] args) {
        int num, i = 1, j = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        num = sc.nextInt();

        while (i <= num) {
            while (j < i) {
                System.out.print("*");
                j+=1;
            }
            System.out.println();
            j = 0;
            i+=1;
        }
    }
}