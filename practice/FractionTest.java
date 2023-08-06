package practice;

public class FractionTest {
    public static void main(String[] args) {
        // Contsructor를 받는 대상은 class다.
        Fractional[] rs = {new Fractional(1, 2), new Fractional(2, 4), new Fractional(4, 8),
                new Fractional(5, 10)};
        for (Fractional r : rs)
            System.out.println(r.toString());
        Fractional r = rs[0];
        Object s = rs[1]; // object equals를 override 하지 않으면 fractional이 아닌 object로 나오기 때문에
                          // overriding해야 한다.
        System.out.println(r.equals(s)); // true (overriding 하지 않았을 때 false)

        System.out.println(Mathx.<Fractional>reduce(Fractional::add, rs[0], rs[1], rs[2], rs[3]));
        // int[] x = fractional(1, 2);
        // int[] y = fractional(2, 4);
        // int[] z = fractional(4, 8);
        // int[] w = fractional(5, 10);
        // System.out.println(toString(add(fractional(1, 2), fractional(4, 8))));
        // System.out.println(x == y);
        // System.out.println(add(x, y) == add(z, w)); // Data를 짤 때, equals 여부를 항상 생각해야 한다.
    }


}


