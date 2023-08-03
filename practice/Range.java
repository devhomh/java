package practice;

public final class Range {

    private int lowerBound;
    private int upperBound;

    // Abstraction Barrier
    // Data = A set of Operation
    // Data 설계 = 만족하는 최소한의 abstraction barrier 설계
    public Range(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        classInvariant();
    }

    public Range(int upperBound) {
        this(0, upperBound);
    }

    private void classInvariant() {
        if (this.getLowerBound() > this.getUpperBound())
            throw new IllegalArgumentException(
                    "Range: " + this.getLowerBound() + "> " + this.getUpperBound());
    }

    public int getUpperBound() { // selectors/accessors (getter in Java)
        return this.upperBound;
    }

    public int getLowerBound() {
        return this.lowerBound;
    }
} // modifiers/mutator (setters in java)
