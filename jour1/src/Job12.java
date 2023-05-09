import java.util.Scanner;

public class Job12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String string1 = sc.nextLine();
        System.out.println("Entrez the second string: ");
        String string2 = sc.nextLine();

        string1 = string1 + string2;
        string2 = string1.substring(0, (string1.length() - string2.length()));
        string1 = string1.substring(string2.length());

        System.out.println("After swap : ");
        System.out.println("string1 : " + string1);
        System.out.println("string2 : " + string2);
    }
}