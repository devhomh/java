package regular;

public final class Epsilon implements Expression {
    // Case 1
    // public static final Expression value = new Epsilon();

    // private Epsilon() {}
    // Case 2
    public static final Epsilon value = new Epsilon();

    protected Epsilon() {}
    // Case 3 : Singleton Pattern
    // 재사용 하는 것 중에서 상태가 변하지 않는 것에 사용. ex) 접속 서버
    // synchronized : Critical Section(멀티 스레드가 동시에 접근해서는 안되는 공유 자원)을 지정하는 java의 키워드
    // private static synchronized Epsilon instance = null;
    // public static Epsilon getInstace(){
    // if (instance == null){ // multi thread에서 Thread safe하지 않다. (병행 환경에서 안전하지 않다)
    // instance = new Epsilon();
    // }
    // return instance;
    // };

    @Override
    public String toString() {
        return "\u03B5";
    }
}
