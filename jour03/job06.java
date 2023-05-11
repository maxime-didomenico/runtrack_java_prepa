import java.util.Random;

public class job06 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Random rand = new Random();
        int i = 0;

        while (i < 10){
            tab[i] = rand.nextInt(100);
            i += 1;
        }

        i = 0;
        System.out.println("tab :");

        while (i < 10){
            System.out.println("tab[" + i + "] = " + tab[i]);
            i += 1;
        }
    }
}