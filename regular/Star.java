package regular;

public final class Star implements Expression {
    private Expression expression;

    public Star(Expression a) {
        this.expression = a;
    }

    public Expression getExpression() {
        return expression;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // public String literals() {
    // return String.valueOf(getExpression());
    // }
}
