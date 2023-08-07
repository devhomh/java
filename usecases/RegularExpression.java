package usecases;

import regular.*;

// Interpreter Pattern (Data의 형태가 언어의 형태를 띠고 있을 때 사용)
public class RegularExpression {
    public static void main(String[] args) {
        Literal a = new Literal('a');
        Literal b = new Literal('b');
        Expression a_ab = a.or(a.then(b));
        Expression ba_a0n = b.then(a).or(Expression.epsilon.or(a.star()));

        // Expression a_ab = new Or(a, new Then(a, b));
        // Case 1
        // Expression ba_a0n = new Or(new Then(b, a), new Or(Epsilon.value, new Star(a)));
        // Case 2
        // Expression ba_a0n = new Or(new Then(b, a), new Or(Expression.epsilon, new Star(a)));
        // Case 3
        // Expression ba_a0n = new Or(new Then(b, a), new Or(Epsilon.getInstace(), new Star(a)));

        System.out.println(a_ab);
        System.out.println(ba_a0n);

        // BinaryOperation e = new Or(a, b);
        // System.out.println(e);

    }
}
