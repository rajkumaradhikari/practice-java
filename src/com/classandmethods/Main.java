package com.classandmethods;

class Calculator{

    int num = 43;
    public int add(int a, int b){
//        System.out.println("In add");
        return a+b;
    }
}
public class Main {
    public static void main(String[] args) {

        Calculator cal = new Calculator();
        Calculator cal1 = new Calculator();

        int add = cal.add(4, 66);

        System.out.println("Sum of two number is : "+add);

        cal.num = 33;

        System.out.println(cal.num);
        System.out.println(cal.num);
    }
}
