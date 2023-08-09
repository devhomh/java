package usecases;

import regular.*;

public final class Literals implements regular.Visitor {
    // String e = "abc" + "def";
    // StringBuf : 쓸데 없이 쓰면 성능이 떨어진다.
    // A thread-safe, mutable sequence of characters. A string buffer is like a
    // String, but can be modified.
    // 1. Assignment
    // 2. Criticla Section , Semaphore
    private StringBuilder literalStringBuilder = new StringBuilder();

    @Override
    public void visit(Epsilon e) {

    }

    @Override
    public void visit(Literal e) {
        literalStringBuilder.append(e.getCharacter());
    }

    @Override
    public void visit(Then e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
    }

    @Override
    public void visit(Or e) {
        e.getLeft().accept(this);
        e.getRight().accept(this);
    }

    @Override
    public void visit(Star e) {
        e.getExpression().accept(this);
    }

    public static String of(Expression e) {
        Literals literals = new Literals();
        e.accept(literals);
        return literals.getLiterals();
    }

    public String getLiterals() {
        return this.literalStringBuilder.toString();
    }

}
