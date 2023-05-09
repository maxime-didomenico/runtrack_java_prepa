import java.util.Scanner;

public class Minute {
    public static void main(String[] args) {
        int min;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a minute number : ");
        min = scanner.nextInt();

        System.out.println(min + " min = " + min/60 + " hours and " +  min%60 + " min.");
    }
}