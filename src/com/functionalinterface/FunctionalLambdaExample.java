package com.functionalinterface;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class FunctionalLambdaExample {
    public static void main(String[] args) {

        MathOperation addition = (a, b) -> a + b;


        MathOperation subtraction = (a, b) -> a - b;

        MathOperation multiplication = (a, b) -> a * b;

        MathOperation division = (a, b) -> {
            if (b != 0) {
                return a / b;
            } else {
                throw new ArithmeticException("Cannot divide by zero");
            }
        };


        int result1 = addition.operate(10, 5);
        int result2 = subtraction.operate(10, 5);
        int result3 = multiplication.operate(10, 5);
        int result4 = division.operate(10, 5);


        System.out.println("Addition: " + result1);
        System.out.println("Subtraction: " + result2);
        System.out.println("Multiplication: " + result3);
        System.out.println("Division: " + result4);
    }
}
