package exam;

public interface Animal {
    public default String type() {
        return this.getClass().getSimpleName();
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
