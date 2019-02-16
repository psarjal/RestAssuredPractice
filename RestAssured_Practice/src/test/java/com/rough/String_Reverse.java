package com.rough;

public class String_Reverse {

    public static void main(String[] args) {

        String s1 = "vasu";
        String s2 = "I am vasu";
        char[] temp = s1.toCharArray();

        // for (int i = s1.length() - 1; i >= 0; i--) {
        // System.out.println(temp[i]);
        // }
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.println(s1.charAt(i));
        }

        String[] temp1 = s2.split(" ");
        for (int i = temp1.length - 1; i >= 0; i--) {
            System.out.print(temp1[i]);
        }
        System.out.println("");
        char[] temp3 = s2.toCharArray();
        for (int i = temp3.length - 1; i >= 0; i--) {
            System.out.print(temp3[i]);
        }

    }

}
