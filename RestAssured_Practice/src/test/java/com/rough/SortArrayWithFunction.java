package com.rough;

import java.util.Arrays;

public class SortArrayWithFunction {

    public static void main(String[] args) {

        int[] a = { 11, 2, 45, 32, 7, 22 };
        System.out.println("Before sorting ::");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        Arrays.sort(a);
        
        System.out.println("\n\nAfter sorting :: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
