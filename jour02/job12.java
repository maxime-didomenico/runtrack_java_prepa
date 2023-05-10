public class job12 {
    public static void main(String[] args) {
        int buff = 0;
        int i = 1;
        while (i <= 6) {
            int j = 1;
            while (j <= 6) {
                int k = 1;
                while (k <= 6) {
                    System.out.println(i + " " + j + " " + k);
                    buff++;
                    k++;
                }
                j++;
            }
            i++;
        }
        System.out.println("Total number of possible combinations : " + buff);
    }
}