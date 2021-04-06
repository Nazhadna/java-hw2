package chapter1;

import java.math.BigInteger;

public class Factorial {

    public static BigInteger calculate(int n) {
        if (n==1)
            return BigInteger.valueOf(1);
        return BigInteger.valueOf(n).multiply(calculate(n-1));
    }
}
