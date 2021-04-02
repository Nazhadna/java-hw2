package chapter4;

import chapter2.Point;

public class Line extends Shape implements Cloneable{
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        to = new Point(to.getX()+dx, to.getY()+dy);
    }

    @Override
    public Point getCenter() {
        return new Point(to.getX() - super.point.getX(), to.getY() - super.point.getY());
    }

    @Override
    public Line clone() {
        return new Line(super.point, to);
    }
}
