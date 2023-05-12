import java.util.Scanner;

public class job6 {
    public static void main(String[] args) {
        int i = 0, sum = 0;
        long start, end, total;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the tab size : ");
        int size = scanner.nextInt();
        int[] tab = new int[size];
        System.out.println("Please fill the tab : ");

        while (i < size){
            tab[i] = scanner.nextInt();
            i++;
        }
        scanner.close();

        start = System.nanoTime();

        i = 0;
        while (i < size){
            try {
                sum += tab[i];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.print("error.");
                break;
            }
            i++;
        }

        end = System.nanoTime();
        total = end - start;

        System.out.println("Total :  " + sum);
        System.out.println("Time : " + total + " ms.");
    }
}