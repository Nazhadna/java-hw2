package chapter4;

import chapter2.Point;

public class Rectangle extends Shape implements Cloneable{
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(super.point.getX()+width/2, super.point.getY()-height/2);
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(super.point, width, height);
    }
}
