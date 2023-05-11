public class job02 {
    public static void main(String[] args) {
        int[] myTab = {12 ,6 ,76 ,89};
        int i = 0;

        System.out.println("myTab before affect :");
        while (i < 4) {
            System.out.println("myTab[" + i + "] = " + myTab[i]);
            i+=1;
        }
        i = 0;
        System.out.println("\nmyTab after affect :");
        while (i < 4) {
            myTab[i] = i;
            System.out.println("myTab[" + i + "] = " + myTab[i]);
            i+=1;
        }
    }
}