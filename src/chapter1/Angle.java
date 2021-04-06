package chapter1;

public class Angle {
    private int angle;

    public Angle(int angle) {
        this.angle = angle;
    }

    public int calculateNormAngle() {
        return ((angle%360) +360)%360;
    }

    public int calculateNormAngle1() {
        return Math.floorMod(angle, 360);
    }
}
