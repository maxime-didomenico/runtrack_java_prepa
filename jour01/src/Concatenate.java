import java.util.Scanner;

public class Concatenate {
    public static void main(String[] args) {
        String firstname, lastname, fullname;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstname = scanner.nextLine();
        System.out.print("Enter your last name: ");
        lastname = scanner.nextLine();
        fullname = firstname + " " + lastname;
        System.out.println("Hello " + fullname);
    }
}