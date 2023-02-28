package org.csystem.app;

import org.csystem.util.number.NumberUtil;
import org.csystem.util.array.ArrayUtil;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String [] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Dizinin eleman sayısını giriniz:");
        int cnt = Integer.parseInt(kb.nextLine());

        int [] array = new int[cnt];

        ArrayUtil.fillRandomArray(array);
        ArrayUtil.print(array);

        System.out.println();

        ArrayUtil.bubbleSortAscending(array);
        ArrayUtil.print(array);

        System.out.println();

        System.out.println("Program sonu....");
    }
}
