package org.csystem.util.array;

import java.util.Random;

public class ArrayUtil {
    public static void bubbleSortAscending(int [] a)
    {
        for (int i = 0; i < a.length - 1; ++i)
            for (int k = 0; k < a.length - 1 - i; ++k)
                if (a[k] > a[k + 1])
                    swap(a, k, k + 1);

    }

    public static void swap(int [] a, int x, int y)
    {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static void print(int [] a)
    {
        for (int i = 0; i < a.length; ++i)
            System.out.printf("%d ", a[i]);
    }

    public static void fillRandomArray(int [] a)
    {
        Random r = new Random();

        for (int i = 0; i < a.length; ++i)
            a[i] = r.nextInt(100);
    }
}
