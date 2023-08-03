package practice;


public class MathxTest { // Name Space
    public static void main(String[] args) {
        MathxTest.testRange();
        // // Heap - Reference Count
        // double[] numbers = new double[args.length];
        // for (int i = 0; i < args.length; i++)
        // numbers[i] = Double.valueOf(args[i]);
        // System.out.println(Mathx.sum(numbers));
        System.out.println(Mathx.sum(new Range(10)));
        System.out.println(Mathx.sum(new Range(0, 10)));
        System.out.println(Mathx.sum(new Range(5, 10)));
        // System.out.println(Mathx.sum(2, 3, 4));
        // System.out.println(Mathx.sum(1, 2, 3, 7, 9, 10, 5, 4, 8, 6)); // Type Promotion

        // BinaryOperation plus = (x, y) -> x + y; // Lambda Expression
        // System.out.println(Mathx.reduce(plus, 0, 1, 2, 3, 4));

        // System.out.println(Mathx.multiply(30, 10));
        // System.out.println(Mathx.multiply(numbers));
        // System.out.println(Mathx.reduceIf(x -> x % 2 == 0, (x, y) -> x * y, 1, 1, 2, 3, 4, 5,
        // 6));
    }

    private static void testRange() {
        RangeTest.classInvariant();
    }
}
