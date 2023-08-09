package subtyping;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = { new Bat(), new Penguin(), new Sparrow() };
        for (Animal animal : animals) {
            Typing.isFly(animal);
            Typing.canSwim(animal);
        }
        // Dynamic method bindig on actual
        // Type- Dynamic Dispatch
        Flyable[] flies = { new FlyableBat(), new Airplane() };
        for (Flyable fly : flies) {
            Typing.isFly(fly);
        }
    }
}
