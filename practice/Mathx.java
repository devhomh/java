package practice;

public class Mathx {
    private Mathx() {}

    public static int fibonacci(int n) { // Recurrence Relation (n은 문제의 크기를 정의)
        if (n < 0)
            throw new IllegalArgumentException("finbonacci: n < 0");
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1; // Base Case
        // Iterative version
        /*
         * int x = 1; int y = 0; int result = 0; int index = 1; while (index != n) { result = x + y;
         * y = x; x = result; index++; } return result;
         */
        return Math.addExact(fibonacci(n - 1), fibonacci(n - 2)); // Recursion Case
    }

    public static int factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("factorial: n < 0");
        return n == 0 ? 1 : Math.multiplyExact(n, factorial(n - 1));
    }
}
