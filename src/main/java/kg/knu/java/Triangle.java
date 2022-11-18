package kg.knu.java;

public class Triangle extends AbstractFigure{
    private static final String NAME = "Triangle";

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2; // полупериметр триугольника
        double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC)); // формуга Герона
        return area;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public static Triangle combine(Triangle t1, Triangle t2) {
        Triangle t3 = new Triangle(t1.getSideA() + t2.getSideA(), t1.getSideB() + t2.getSideB(), t1.getSideC() + t2.getSideC());
        return t3;
    }
}
