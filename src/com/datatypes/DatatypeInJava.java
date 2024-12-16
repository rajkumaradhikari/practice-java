package com.datatypes;

public class DatatypeInJava {
    public static void main(String[] args) {
        // Primitive Data Types
       byte b =10;
       short s = 200;
       int i =5000;
       long l = 100000l;
       float f = 3.4f;
       double d = 19.5;
       char c = 'A';
       boolean bool = true;

       // Non primitive data types
        String str = "Java is fun";
        int[] array = {1,2,3,4,5,6};

        // Display values
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        System.out.println("String: " + str);

        System.out.println("Array: ");
        for(int num : array){
            System.out.print(num+ " ");
        }
    }
}
