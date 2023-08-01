package practice;

@FunctionalInterface
public interface BinaryOperation { // interface: 지켜야 할 조건을 기술.
    public double apply(double x, double y);
    // Lambda Expression : Method가 한개여야 한다.
}
