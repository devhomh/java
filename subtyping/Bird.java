package subtyping;

// 중간 타입이 필요한 이유는 후에 새로운 연산이나 조건을 추가할 때 더 유용하게 하기 위해 세분화 시킨다.
public interface Bird extends Animal {
    @Override
    public default boolean isFly() {
        return true;
    }
}

// abstract class Bird extends Animal {
// public Bird(boolean flyable) {
// super(flyable);
// }
// }
