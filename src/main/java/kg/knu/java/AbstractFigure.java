package kg.knu.java;

abstract public class AbstractFigure {
    public abstract double getArea();
    public abstract String getName();


    public static void main(String[] args) {
        AbstractFigure[] figure = {new Rectangle(8, 12),
                new Triangle(5, 8, 5),
                new Circle(10)};

        for(AbstractFigure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea());
    }
}
