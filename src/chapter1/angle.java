package chapter1;

public class angle {
    private int angle;

    public angle(int angle) {
        this.angle = angle;
    }

    public int calculateNormAngle() {
        return ((angle%360) +360)%360;
    }

    public int calculateNormAngle1() {
        return Math.floorMod(angle, 360);
    }
}
