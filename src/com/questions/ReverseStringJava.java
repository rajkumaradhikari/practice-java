package com.questions;

import java.util.Scanner;

public class ReverseStringJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse");
        String str = sc.nextLine();
        System.out.print("Reverse String is : ");
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
