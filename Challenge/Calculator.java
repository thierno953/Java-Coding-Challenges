package Challenge;

public class Calculator {
    public static void main(String[] args) {
        // implementation of calculator logic
        int num1 = 10;
        int num2 = 3;

        int add = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1 * num2;
        int divide = num1 / num2;
        int modulo = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + add);
        System.out.println(num1 + " - " + num2 + " = " + subtract);
        System.out.println(num1 + " * " + num2 + " = " + multiply);
        System.out.println(num1 + " / " + num2 + " = " + divide);
        System.out.println(num1 + " % " + num2 + " = " + modulo);
    }
}
