public class job06 {
    public static void main(String[] args) {
        int i = 0, res = 0;

        while (i < 100) {
            i += 1;
            if (i % 2 == 0) {
                res += i;
            }
        }
        System.out.println("result = " + res);
    }
}