package com.conditionalstatement;

import java.util.Scanner;

public class ConditionalStatementsExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
            if (age >= 60) {
                System.out.println("You are also eligible for senior citizen benefits.");
            }
        } else {
            System.out.println("You are not eligible to vote.");
        }


        System.out.print("Enter a grade (A, B, C, D, or F): ");
        char grade = scanner.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good Job!");
                break;
            case 'C':
                System.out.println("Fair.");
                break;
            case 'D':
                System.out.println("Needs Improvement.");
                break;
            case 'F':
                System.out.println("Fail.");
                break;
            default:
                System.out.println("Invalid grade entered.");
        }

        scanner.close();
    }
}

