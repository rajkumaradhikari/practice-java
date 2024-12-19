package com.functionalinterface;

interface A{
   public void show();
}

//class B implements A{
//    @Override
//    public void show(){
//        System.out.println("Testing");
//    }
//}

public class Main {
    public static void main(String[] args) {
//      A obj = new A() {
//          @Override
//          public void show() {
//              System.out.println("Testing lambda expression");
//          }
//      };
//        obj.show();
        A obj = ()-> System.out.println("Testing lambda expressing");
        obj.show();
    }
}
