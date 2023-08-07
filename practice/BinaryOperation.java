package practice;

@FunctionalInterface
public interface BinaryOperation<T> { // interface: 지켜야 할 조건을 기술.
    public T apply(T x, T y);
    // Lambda Expression : Method가 한개여야 한다.
}


// class Stack<T> {
// public stack() {}

// public Stack push(Object newElem) {}

// public Stack pop() {}

// public T top() {}

// }

// // 위 처럼 작성하지 않으면 작성한 SuperType 이외의 타입이 들어가는 것을 막을 수 없다.
// // supertype의 타입 (Object, Number..)중 어떤 것인지 체크하기 위해 수많은 if절을 사용해야 한다.
// // if (o instanceof ...) ...
// // T type은 실제 작성된 type의 템플릿(재사용) -> 실제 사용되는 코드가 아니다. -> compile될 때 자동으로 그 타입으로 생성함.
// // primitive type은 값이 주소값을 가리키기 때문에
// // value semantics
// public static void main(String[] args) {
// // Primitive Type vs Reference Type
// int x = 4; // stack에 있음
// Integer y = new Integer(4); //heap에 있음 -> Integer = Wrapper Class
// // Boxing = primitive type을 Wrapper Class로 싸는 것
// Stack s = new Stack();
// s.push(new Integer(0));
// s.push(new String(""));
// Object o = s.pop();
// }
