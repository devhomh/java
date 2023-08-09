package regular;

public final class Literal implements Expression {

    private char character;

    public Literal(char c) {
        this.character = c;
    }

    public char getCharacter() {
        return character;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    // public String literals() {
    // return String.valueOf(this.character);
    // }
}
