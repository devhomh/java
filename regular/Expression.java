package regular;

// Expression은 Super Type
public interface Expression {

    // Case 2
    public static final Epsilon epsilon = Epsilon.value;
    // Case 3
    // public final static Epsilon epsilon = Epsilon.getInstace();

    // Abstract Barrier을 사용하는 유저이기 때문에 Implement가 필요없다.
    public default Expression or(Expression e) {
        return new Or(this, e);
    }

    public default Expression then(Expression e) {
        return new Then(this, e);
    }

    public default Expression star() {
        return new Star(this);
    }

    public void accept(Visitor visitor);
}

// Abstract Class : Partial Implementation = Inheritance (Ctrl + C,V)
// (Code를 Sharing 하여 확장)
// (Abstract <-> Concrete)
// Implementation = Representation (Abstract Barrier의 아래에 있는 것들을 기술하는 것)
// Interface : Type Signature(제약 조건)만을 가지고 있는 Abstract Class
// Pure Virtual Class (in C++)

// Interface : Requiremnents들을 기술.
