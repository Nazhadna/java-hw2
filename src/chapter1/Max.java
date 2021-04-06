package chapter1;

public class Max {
    private int x1;
    private int x2;
    private int x3;

    public Max(int x1, int x2, int x3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public int countMaxWithHands() {
        if (x1>x2)
            if (x1>x3)
                return x1;
            else return x3;
            else if (x2>x3)
                return x2;
            else return x3;
    }

    public int countMax() {
        return Math.max(Math.max(x1,x2),x3);
    }
}
