public class job03 {
    public static void main(String[] args) {
        String[] tab = {"Josette", "John", "Myrtille", "Marc"};
        int i = 0;

        while (i < 4) {
            if (tab[i] == "John") {
                System.out.println("John is at index : " + i);
            }
            i+=1;
        }
        tab[2] = "Mirelle";
        i = 0;

        while (i < 4) {
            System.out.println("tab[" + i + "] = " + tab[i]);
            i+=1;
        }
    }
}