package dynamicDispatch;

public class Left implements Top {

    public void accept(Visitor v) {
        v.visit(this);
    }
}
