package practice;

public class FractionTest { // fractional, numerator, denomiator는 Abstraction Barrier
    public static int[] fractional(int x, int y) {
        if (y == 0) { // precondition
            throw new IllegalArgumentException("denomiator can't be 0");
        }
        int[] rep = new int[] {x, y};
        classInvariant(rep);
        return rep;
    }

    private static void classInvariant(int[] rep) {
        int[] tmp = rep;
        rep[0] *= 2;
        rep[1] *= 2;
        normalize(rep);
        if (rep != tmp)
            throw new IllegalArgumentException("분자 분모의 비율이 같지 않습니다.");
    }

    public static int numerator(int[] r) { // getter
        normalize(r);
        return r[0];
    }

    public static int denomiator(int[] r) { // getter
        normalize(r);
        return r[1];
    }

    public static boolean equals(int[] x, int[] y) {
        return (numerator(x) == numerator(y) && denomiator(x) == denomiator(y));
    }

    private static void normalize(int[] r) {
        int gcd = Mathx.gcd(r[0], r[1]);
        r[0] /= gcd;
        r[1] /= gcd;
    }


    public static void main(String[] args) {
        int[][] rs = {fractional(1, 2), fractional(2, 4), fractional(4, 8), fractional(5, 10)};
        for (int[] r : rs)
            System.out.println(toString(r));
        System.out.println(rs[0] == rs[1]);
        // int[] x = fractional(1, 2);
        // int[] y = fractional(2, 4);
        // int[] z = fractional(4, 8);
        // int[] w = fractional(5, 10);
        // System.out.println(toString(add(fractional(1, 2), fractional(4, 8))));
        // System.out.println(x == y);
        // System.out.println(add(x, y) == add(z, w)); // Data를 짤 때, equals 여부를 항상 생각해야 한다.
    }

    private static String toString(int[] fraction) {
        return numerator(fraction) + "/" + denomiator(fraction);
    }

    private static int[] add(int[] x, int[] y) {
        return fractional(numerator(x) * denomiator(y) + numerator(y) * denomiator(x),
                denomiator(x) * denomiator(y));
    }
}


