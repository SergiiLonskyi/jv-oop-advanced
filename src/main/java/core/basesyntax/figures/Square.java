package core.basesyntax.figures;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void getInfo() {
        System.out.println("Figure: square, area: " + getArea() + " sq.units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}