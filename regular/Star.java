package regular;

public final class Star implements Expression {
    private Expression expression;

    public Star(Expression a) {
        this.expression = a;
    }

    public Expression getExpression() {
        return expression;
    }

    @Override
    public String toString() {
        return "(" + this.getExpression() + ")" + "*";
    }
}
