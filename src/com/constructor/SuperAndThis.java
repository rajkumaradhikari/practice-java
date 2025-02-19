package com.constructor;

public class SuperAndThis {

    public SuperAndThis(){
        System.out.println("In A");
    }
    public SuperAndThis(int a){
        System.out.println("In int a");
    }
}

class B extends  SuperAndThis{

    public B(){
        System.out.println("In B");
    }
    public B(int b){
//        super(b);
        this();
        System.out.println("In  b int");
    }
}
class Main{
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
