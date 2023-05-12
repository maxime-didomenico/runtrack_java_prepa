public class MyString {
    public static void main(String[] args) {
        String s1 = "string1";

        char[] chars = {'s', 't', 'r', 'i', 'n', 'g', '2'};
        String s2 = new String(chars);

        int x = 3;
        String s3 = String.valueOf(x);

        String s4;
        s4 = "string4";

        System.out.println(s1 + "\n" + s2 + "\n" + s3 + "\n" + s4);
    }
}