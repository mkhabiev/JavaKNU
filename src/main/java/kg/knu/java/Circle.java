package kg.knu.java;

public class Circle extends AbstractFigure {
    private static final String NAME = "Circle";

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static Circle combine(Circle c1, Circle c2) {
        Circle c3 = new Circle(c1.getRadius() + c2.getRadius());
        return c3;
    }
}
