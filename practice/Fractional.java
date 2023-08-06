package practice;

// How to design type
// 1. primitive operations to define a [data] type [set]
// - abstraction data type(ADT), where primitives = abstraction barrier
// 2. combinations (combinational operation)
// - e.g) add, multiply...

// extends - class | implements - interface

// Polymorphism : Overloading, Generic Programming, Sub-Typing

// Data Structure - Iterator - Algorithm
// Fractional = Definition
public class Fractional extends Number { // (extends java.lang.Object)

    // declarization = Fractional 값의 이름을 지정.
    private int numerator;
    private int denominator;
    // private int[] rep;

    // fractional, numerator, denomiator는 Abstraction Barrier
    // Constructor는 Class에게 부탁하는 것. (In Java)
    public Fractional(int numerator, int denominator) {
        if (denominator == 0) { // precondition
            throw new IllegalArgumentException("denomiator can't be 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        // this.rep = new int[] {numerator, denominator};
        normalize();
        // classInvariant(rep);
    }

    // movie(circle, point(x,y))
    // circle move: point(x,y) -> circle.move(point(x,y))
    // message-passing paradigm

    // projection
    // (name, gender, age) = person
    // person.name
    public int getNumerator() { // getter
        return this.numerator;
    }

    public int getDenominator() { // getter
        return this.denominator;
    }

    // fractional은 set해서는 안되고 getter만 있기 때문에 immutable.

    private void normalize() {
        int gcd = Mathx.gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public Fractional add(Fractional r) {
        return new Fractional(
                this.getNumerator() * r.getDenominator() + this.getNumerator() * r.getDenominator(),
                r.getDenominator() * r.getDenominator());
    }

    // toString은 주로 debugging 목적으로 많이 쓰인다.
    @Override
    public String toString() {
        return this.getNumerator() + "/" + this.getDenominator();
    }

    // private static void classInvariant(rep) {
    // int[] tmp = rep;
    // rep[0] *= 2;
    // rep[1] *= 2;
    // normalize(rep);
    // for (int i = 0; i < tmp.length; i++) {
    // if (rep[i] != tmp[i])
    // throw new IllegalArgumentException("분자 분모의 비율이 같지 않습니다.");
    // }
    // }

    // hash : 정렬하지 않고 곧바로 검색하는 것.
    // hash function 특징 - 생성 시에는 빠르게 해야 하고, 복원할 때는 오래 걸려야한다.
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + this.numerator;
        result = prime * result + this.denominator;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (getClass() != obj.getClass())
            return false;
        Fractional other = (Fractional) obj;
        return this.equals(other);
    }

    public boolean equals(Fractional that) {
        if (this == that)
            return true;
        if (that == null)
            return false;
        return (this.getNumerator() == that.getNumerator()
                && this.getDenominator() == that.getDenominator());
    }

    @Override
    public int intValue() {
        return (int) this.longValue();
    }

    @Override
    public long longValue() {
        return this.getNumerator() / this.getDenominator();
    }

    @Override
    public double doubleValue() {
        return (double) this.getNumerator() / this.getDenominator();
    }

    @Override
    public float floatValue() {
        return (float) this.doubleValue();
    }
}

