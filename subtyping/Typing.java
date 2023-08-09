package subtyping;

interface Flyable {

}

interface Swimmable {

}

final class Airplane implements Flyable {

}

final class FlyableBat extends Bat implements Flyable {

}

final class SuperPenguin extends Penguin implements Flyable, Swimmable {

}

// Legacy Code
class Typing implements Animal {
    public static String type(Object thing) {
        return thing.getClass().getSimpleName();
    }

    public static void isFly(Animal x) {
        System.out.println(Typing.type(x) + (x.isFly() ? "는(은) 날 수 있어." : "는(은) 못날아."));
        // Dynamic Dispatch on types
        // if (a instanceof 박쥐) // RTTI (Runtime Type Identification) -> RTTI를 확장 가능하게 한
        // 기능 = Overriding
        // Overriding

        // if (a instanceof 참새)
        // if (a instanceof 펭귄)...
    }

    // 동작을 물어보는 것이 아닌 Type을 물어보는 것이다.
    public static void isFly(Flyable thing) {
        System.out.println(Typing.type(thing) + "는(은) 날 수 있어");
    }

    public static void canSwim(Animal x) {
        System.out.println(Typing.type(x) + (x.canSwim() ? "는(은) 헤엄칠 수 있어." : "는(은) 헤엄칠수 없어."));
    }
}
