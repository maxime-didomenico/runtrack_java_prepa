public class job01 {
    public static void main(String[] args) {
        int[] tab = new int[5];
        int i = 0;

        tab[0] = 10;
        tab[2] = 2;
        tab[4] = 69;

        System.out.println("tab adress = " + tab);

        while (i < 5) {
            System.out.println("tab[" + i + "] = " + tab[i]);
            i+=1;
        }
    }
}