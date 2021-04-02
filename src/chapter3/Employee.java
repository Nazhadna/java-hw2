package chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Employee implements Measurable{

    private String name;

    public Employee() {
        name = "Employee" + (int)(Math.random()*50);
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return Math.random()*150 + 50;
    }

}
