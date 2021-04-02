package chapter1;

public class number {
    private int numberInt;

    public number(int numberInt) {
        this.numberInt = numberInt;
    }

    public void setNumberInt(int numberInt) {
        this.numberInt = numberInt;
    }

    public String makeBin() { return Integer.toBinaryString(numberInt); }

    public String makeOctal() {
        return Integer.toOctalString(numberInt);
    }

    public String makeHex() {
        return Integer.toHexString(numberInt);
    }

    public String makeReciprocalHex() {
        return Float.toHexString((float)1 / numberInt);
    }

    //захотелось написать ручками
    private int makeTransformation(int numberBase) {
        int currentNum = numberInt;
        int currentRes = 0;
        int power = 0;
        while (currentNum > 0) {
            currentRes += (currentNum % numberBase) * Math.pow(10, power++);
            currentNum /= numberBase;
        }
        return currentRes;
    }

}