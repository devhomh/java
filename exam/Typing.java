package exam;

class Typing implements Animal {
    public static void isFly(Animal x) {
        System.out.println(x.type() + (x.isFly() ? "는(은) 날 수 있어." : "는(은) 못날아."));
        // Dynamic Dispatch on types
        // if (a instanceof 박쥐) // RTTI (Runtime Type Identification) -> RTTI를 확장 가능하게 한 기능 =
        // Overriding

        // if (a instanceof 참새)
        // if (a instanceof 펭귄)...
    }


    public static void canSwim(Animal x) {
        System.out.println(x.type() + (x.canSwim() ? "는(은) 헤엄칠 수 있어." : "는(은) 헤엄칠수 없어."));
    }
}
