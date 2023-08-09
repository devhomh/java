package regular;

// java에서 sub-typing과 sub-class를 구분지을 수 없기 때문에 방지하기 위해 protected를 사용해야 한다.
abstract class BinaryOperationBase {
    private Expression left;
    private Expression right;
    // private String operator;

    // protected로 써야 하는 이유 : super로 접근하기 위해서
    // protected BinaryOperation(Expression left, String operator, Expression right) {
    protected BinaryOperationBase(Expression left, Expression right) {
        this.left = left;
        this.right = right;
        // this.operator = operator;
    }


    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    protected abstract String getOperator() {}

    @Override
    public String toString() {
        return "(" + this.getLeft() + this.getOperator() + this.getRight() + ")";
    }
}

// Sub-Typing vs Sub-Class
// SUb-Typing : A가 B의 타입을 대체할 수 있는 것. (is a)
// Sub-Class : 하위 Class가 상위 Class의 Implementation을 Ctrl + C,V
// (Or, Then은 BinaryOperation의 Sub-Class다.)
// Sub-Class는 Delegation으로 호환 가능하다. (Listener 방식)
// overloading / sub-typing / type parameter polymorphism
// interface는 여러개를 implements 할수 있음.
// interface는 다른 interface를 extends할 수 있다.
// Diamond-lattice
// java에서 sub-class(delegation) 하는 것은 한개만 할 수 있다.
