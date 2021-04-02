import chapter1.*;
import chapter2.Car;
import chapter2.Point;
import chapter3.Department;
import chapter3.Employee;
import chapter3.Measurable;
import chapter4.Circle;
import chapter4.Line;
import chapter4.Rectangle;
import chapter4.Shape;

import java.util.Arrays;
import java.util.Calendar;

public class MainClass {
    public static void main(String[] args) {

        System.out.println("-------Ex1.1-------");
        number n = new number(15);
        System.out.println(n.makeBin());
        System.out.println(n.makeOctal());
        System.out.println(n.makeHex());
        System.out.println(n.makeReciprocalHex());

        System.out.println("-------Ex1.2-------");
        angle a = new angle(-400);
        System.out.println(a.calculateNormAngle());
        System.out.println(a.calculateNormAngle1());

        System.out.println("-------Ex1.3-------");
        max m = new max(9,6,5);
        System.out.println(m.countMaxWithHands());
        System.out.println(m.countMax());

        System.out.println("-------Ex1.4-------");
        System.out.println(Math.nextUp(0.0));
        System.out.println(Double.MAX_VALUE);

        System.out.println("-------Ex1.6-------");
        factorial f = new factorial();
        System.out.println(f.calculate(1000));

        System.out.println("-------Ex1.13-------");
        lottery l = new lottery();
        System.out.println(Arrays.toString(l.getPickedNums().toArray()));

        System.out.println("-------Ex2.5-------");
        System.out.println(new Point(3,4).translate(1,3).scale(0.5));

        System.out.println("-------Ex2.9-------");
        Car car = new Car();
        car.drive(250);
        System.out.println(car.getFuelLevel());
        car.refuel(30);
        System.out.println(car.getFuelLevel());
        car.drive(-100);
        System.out.println(car.getCurrentDistance());

        System.out.println("-------Ex3.1,3.2-------");
        Measurable[] meas = new Measurable[15];
        for (int i=0; i<15; i++)
            meas[i] =new Employee();
        Department dep = new Department();
        System.out.println(dep.average(meas));
        System.out.println(((Employee)dep.largest(meas)).getName());

        System.out.println("-------Ex4.4-------");
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(new Point(4,5), 2);
        shapes[1] = new Rectangle(new Point(6,2),4,2);
        shapes[2] = new Line(new Point(5,5), new Point(8,9));
        shapes[1].moveBy(4,4);
        System.out.println(shapes[1].getCenter());
        Circle circle = new Circle(new Point(4,5), 2);
        Circle circle1 = circle.clone();
        circle1.moveBy(5,2);
        System.out.println(circle1.getCenter());
    }

}
