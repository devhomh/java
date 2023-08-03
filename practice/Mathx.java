package practice;

public class Mathx {
    public static void main(String[] args) {
        double[] numbers = new double[args.length];
        int index = 0;
        for (String numeral : args) {
            numbers[index] = Double.valueOf(numeral);
            index++;
        }
    }

    public static double reduce(BinaryOperation binaryOperation, double init, double... numbers) {
        return reduceIf(x -> true, binaryOperation, init, numbers);
    }

    // fold-{right, left}, accumulate
    public static double reduceIf(Predicate predicate, BinaryOperation binaryOperation, double init,
            double... numbers) {
        double result = init;
        for (double number : numbers) // Liskov's Substitution Principle (LSP)
            if (predicate.apply(number))
                result = binaryOperation.apply(result, number);

        return result;
    }

    // sum :: int -> 1 + ... + n
    public static int sum(int n) { // Overloading
        return n * (n + 1) / 2;
    }

    // sum :: int -> int (Class 필요)
    public static int sum(Range range) {
        return sum(range.getUpperBound()) - sum(range.getLowerBound() - 1);
    }

    public static double sum(double... numbers) { // Type Signature
        return Mathx.reduce(new Plus(), 0, numbers);
    }

    // 변수 = (이름, 값, 범위 (Scope), Type (저장 공간 크기, 값의 해석), Life Time)
    // 이름이 Abstraction 한다.

    public static double multiply(double... numbers) {
        return Mathx.reduce(new Multiply(), 1, numbers);
    }

    public static int gcd(int i, int j) {
        int min = i < j ? i : j;
        for (int index = min; i > 1; i--)
            if (i % index == 0 && j % index == 0)
                return index;
        return 1;
    }
}
