package chapter4;

import chapter2.Point;

public class Circle extends Shape implements Cloneable{
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public void m() { }

    @Override
    public Point getCenter() {
        return super.point;
    }

    @Override
    public Circle clone() {
        return new Circle(super.point, radius);
    }
}