package exam;

public class AnimalTest {
    public static void main(String[] args) {
        Typing.isFly(new Bat());
        Typing.isFly(new Penguin());
        Typing.isFly(new Sparrow());
        Typing.canSwim(new Bat());
        Typing.canSwim(new Penguin());
        Typing.canSwim(new Sparrow());
        // Dynamic method bindig on actual
        // Type- Dynamic Dispatch
    }
}
