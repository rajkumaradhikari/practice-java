package com.typecasting;

public class Main {
    public static void main(String[] args) {
        byte b = 122;
        int a = 12;
        b = (byte)a;
        System.out.println(b);

        // Widening casting (automatic)
        int intValue = 10;
        double doubleValue = intValue;
        System.out.println("Widened value (int to double): " + doubleValue);

        // Narrowing casting (explicit)
        double originalValue = 15.75;
        int narrowedValue = (int) originalValue;
        System.out.println("Narrowed value (double to int): " + narrowedValue);
    }

}
