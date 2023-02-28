package org.csystem.util.number;

public class NumberUtil {
    public static boolean isPrime(long val)
    {
        if (val <= 1)
            return false;

        long half = val / 2;

        for (long i = 2; i <= half; ++i)
            if (val % i == 0)
                return false;

        return true;
    }
}
