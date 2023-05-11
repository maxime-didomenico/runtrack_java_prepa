public class job08 {
    public static void main(String[] args) {
        int[][] tab = {{5, 9, 3}, {7, 2, 8}, {1, 6, 4}};
        int i = 0, j = 0;

        System.out.println("tab brefore : \n");
        while (i < 3){
            while (j < 3){
                System.out.println("tab[" + i + "][" + j + "] = " + tab[i][j]);
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }

        i = 0;
        j = 0;
        sortMatrix(tab);
        System.out.println("\ntab after : ");
        while (i < 3){
            while (j < 3){
                System.out.println("tab1[" + i + "][" + j + "] = " + tab[i][j]);
                j++;
            }
            j = 0;
            i++;
        }
    }

    public static void sortMatrix(int[][] tab) {
        int i = 0, j = 0, swap;

        while (i < 3) {
            while (j < 3){
                if (j == 2 && i < 2){
                    if (tab[i][j] > tab[i+1][0]){
                        swap = tab[i][j];
                        tab[i][j] = tab[i+1][0];
                        tab[i+1][0] = swap;
                        i = 0;
                        j = 0;
                    }
                }
                if (j < 2) {
                    if (tab[i][j] > tab[i][j+1]) {
                        swap = tab[i][j];
                        tab[i][j] = tab[i][j + 1];
                        tab[i][j + 1] = swap;
                        i = 0;
                        j = 0;
                    }
                }
                j++;
            }
            i++;
            j = 0;
        }
    }
}