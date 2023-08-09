package regular;

public final class Then extends BinaryOperationBase implements Expression {
    public Then(Expression left, Expression right) {
        super(left, right);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // public String literals() {
    // return String.valueOf(this);
    // }

}
