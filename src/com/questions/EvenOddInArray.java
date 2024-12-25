package com.questions;

public class EvenOddInArray {
    public static void main(String[] args){
        int[] numbers ={1,2,3,4,5,6,7};

        int evenCount = 0;
        int oddCount = 0;

        for (int numb:numbers){
            if (numb%2==0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even number count :"+evenCount);
        System.out.println("Odd number count :"+oddCount);
    }
}
