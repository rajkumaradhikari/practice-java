package com.superkeyowrd;

class A{
    String name = "Class A";

    public A(int a){
        System.out.println("Inside constructor A");
    }

    void show(){
        System.out.println("Inside class A");
    }
}

class B extends A{

    public B(){
        super(10);
        System.out.println("Inside constructor B");
        System.out.println(super.name);
    }

    String name = "Class B";
    void show(){
        System.out.println("Inside class B");
       super.show();

    }
}
public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();

    }
}
