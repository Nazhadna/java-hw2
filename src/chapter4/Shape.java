package chapter4;

import chapter2.Point;

public abstract class Shape {
    protected Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point = new Point(point.getX()+dx, point.getY()+dy);
    }

    public abstract Point getCenter();
}
