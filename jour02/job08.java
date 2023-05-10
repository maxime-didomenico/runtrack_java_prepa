import java.util.Scanner;

public class job08 {
    public static void main(String[] args) {
        int i = 0, num, buff;

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        num = sc.nextInt();
        buff = num;

        while (buff != 0) {
            buff /= 10;
            i++;
        }
        System.out.println("The number " + num + " have : " + i + " digits.");
    }
}