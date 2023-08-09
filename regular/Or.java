package regular;

public final class Or extends BinaryOperationBase implements Expression {

    public Or(Expression left, Expression right) {
        super(left, right);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // public String literals() {
    // return String.valueOf(this);
    // }
}
