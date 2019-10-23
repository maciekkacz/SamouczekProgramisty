package interfaces;

public class Rectangle implements Figure {
    private double bokA;
    private double bokB;

    public Rectangle(double bokA, double bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    public double getArea() {
        return bokA * bokB;
    }

    public double getPerimeter() {
        return 2 * bokA + 2 *bokB;
    }
}
