package practice;

public class MathxTest {

    public static void main(String[] args) {
        MathxTest.fibonacciTest();
        MathxTest.factorialTest();
    }

    private static void factorialTest() {
        FactorialTest.baseCase();
        FactorialTest.recursionCase();
        FactorialTest.preCondition();
        FactorialTest.postCondition();
    }

    public static void fibonacciTest() {
        FibonacciTest.baseCase();
        FibonacciTest.recursionCase();
        FibonacciTest.preCondition(); // Require (Design by contract) -> 주로 인자와 관계
        FibonacciTest.postCondition(); // Satisfy -> return 값과 관계
    }

    private MathxTest() {} // -> Default Constructor
}
