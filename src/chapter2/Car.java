package chapter2;

public class Car {
    private final double fuelEfficiency;
    private final double gasMax = 50;
    private double x = 0;
    private double gas = 40;

    public Car() {
        this.fuelEfficiency = 0.07;
    }

    public Car(double x, double gas) {
        this.fuelEfficiency = 0.07;
        this.x = x;
        this.gas = gas;
    }

    public void drive(double dx) {
        x += dx;
        gas -= fuelEfficiency * Math.abs(dx);
    }

    public void refuel(double additive) {
        gas += additive;
        if (gas > gasMax) //перелил
            gas = gasMax;
    }

    public double getCurrentDistance() {
        return x;
    }

    public double getFuelLevel() {
        return gas;
    }
}
