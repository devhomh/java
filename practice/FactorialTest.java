package practice;

import static practice.Mathx.*;

public class FactorialTest {

    private FactorialTest() {}

    public static void baseCase() {
        assert factorial(0) == 1;
    }

    public static void recursionCase() {
        int[][] answers = {{2, 2}, {6, 720}, {8, 320}, {11, 39916800}};
        for (int[] answer : answers)
            assert factorial(answer[0]) == answer[1];
    }

    public static void preCondition() {
        try {
            factorial(-1);
        } catch (IllegalArgumentException e) {
            return;
        }
        assert false;
    }


    public static void postCondition() {
        try {
            factorial(Integer.MAX_VALUE);
        } catch (ArithmeticException e) {
            System.out.println("factorial: arithmetic overflow");
            return;
        } catch (StackOverflowError e) {
            System.out.println("factorial: stack overflow");
            return;
        }
        assert false; // J-Unit 활용
    }

}
