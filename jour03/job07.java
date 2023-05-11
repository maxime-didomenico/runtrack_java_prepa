public class job07 {
    public static void main(String[] args) {
        int[][] tab1 = { {1,2,3} , {4,5,6} , {7,8,9} }, tab2 = { {10,20,30} , {40,50,60} , {70,80,90} };
        int i = 0, j = 0;

        System.out.println("tab1 : ");
        while (i < 3){
            while (j < 3){
                System.out.println("tab1[" + i + "][" + j + "] = " + tab1[i][j]);
                j++;
            }
            j = 0;
            i++;
        }

        i = 0;
        j = 0;
        System.out.println("\ntab2 : ");
        while (i < 3){
            while (j < 3){
                System.out.println("tab2[" + i + "][" + j + "] = " + tab2[i][j]);
                j++;
            }
            j = 0;
            i++;
        }

        i = 0;
        j = 0;
        System.out.println("\ntab1 + tab2 : ");
        while (i < 3){
            while (j < 3){
                System.out.println("add tab[" + i + "][" + j + "] = " + (tab2[i][j] + tab1[i][j]));
                j++;
            }
            j = 0;
            i++;
        }
    }
}