package subtyping;

// abstract class Animal {
//     private boolean flyable; // Implementation이 생겼기 때문에 interface를 사용할 수 없다.
//     protected Animal(boolean flyable){
//         this.flyable = flyable;
//     }
//     public default boolean isFly() {
//         return flyable;
//     }
//     public default String type() {
//         return Typing.type(this);
//     }
// }

public interface Animal {
    public default String type() {
        return Typing.type(this);
    }

    public default boolean isFly() {
        return false;
    }

    public default boolean canSwim() {
        return false;
    }
    // 연산을 추가 했을 떄, Type의 정의가 바뀌게 되면 Sub-Type의 정의가 모두 바뀌어야 한다.
    // 중간 타입이 생겼을 때 위아래로 모두 수정해야 하는 불편함이 생긴다.
}

// Interface는 새로운 Type을 추가하는데는 도움이 되지만, 새로운 연산을 추가할 때는 어려움이 있다.
