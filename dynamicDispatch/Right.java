package dynamicDispatch;

public class Right implements Top {

    public void accept(Visitor v) {
        v.visit(this);
    }
}
