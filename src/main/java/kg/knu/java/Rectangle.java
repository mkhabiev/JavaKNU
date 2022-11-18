package kg.knu.java;

public class Rectangle extends AbstractFigure{
    private static final String NAME = "Rectangle";
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static Rectangle combine(Rectangle r1, Rectangle r2) {
        Rectangle r3 = new Rectangle(r1.getHeight() + r2.getHeight(), r1.getWidth() + r2.getWidth());
        return r3;
    }
}
