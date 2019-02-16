package com.rough;

public class SortArrayWithoutFunction {

    public static void main(String[] args) {

        int[] a = { 11, 2, 45, 32, 7, 22 };
        int temp;
        System.out.println("Before sorting ::");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("\n\nAfter sorting :: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

}
