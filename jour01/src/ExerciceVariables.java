public class ExerciceVariables {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2, swap = 0;
        System.out.println("num1 = " + num1 + "\nnum2 = " + num2);
        swap = num1;
        num1 = num2;
        num2 = swap;
        System.out.println("* Swap *\nnum1 = " + num1 + "\nnum2 = " + num2);
    }
}