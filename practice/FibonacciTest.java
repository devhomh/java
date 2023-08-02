package practice;

import static practice.Mathx.*; // Static Import

public class FibonacciTest {

    private FibonacciTest() {};

    public static void baseCase() {
        if (fibonacci(0) == 0 && fibonacci(1) == 1)
            return;
        System.exit(1);
    }

    public static void recursionCase() {
        int[] answers = {0, 1, 1, 2, 3, 5};
        for (int i = 0; i < answers.length; i++)
            if (answers[i] != fibonacci(i))
                System.exit(1);
    }

    public static void preCondition() {
        try {
            fibonacci(-1);
        } catch (IllegalArgumentException e) {
            return;
        }
        System.exit(1);
    }

    public static void postCondition() {
        try {
            for (int n = 0; n < 100; n++)
                fibonacci(n);
        } catch (ArithmeticException e) {
            return;
        } catch (StackOverflowError s) {
            System.out.println("fibonacci: n is too big!");
            return;
        }
        System.exit(1);
    }

}
