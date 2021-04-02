package chapter1;

import java.math.BigInteger;

public class factorial {

    public BigInteger calculate(int n) {
        if (n==1)
            return BigInteger.valueOf(1);
        return BigInteger.valueOf(n).multiply(calculate(n-1));
    }
}
