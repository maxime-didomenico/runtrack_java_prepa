public class job04 {
    public static void main(String[] args) {
        int[] tab = {3, 7, 3, 9, 8};
        int i = 0, j = 0, num = 0;

        while (i <= 4) {
            while (j <= 4) {
                if (tab[i] == tab[j]) {
                    num += 1;
                }
                j += 1;
            }
            System.out.println("we find the " + tab[i] + " number " + num + " times in this tab.");
            i += 1;
            j = 0;
            num = 0;
        }
    }
}