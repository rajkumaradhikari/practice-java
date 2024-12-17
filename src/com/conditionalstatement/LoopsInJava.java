package com.conditionalstatement;

public class LoopsInJava {
    public static void main(String[] args) {

        int i = 1;

        //while loop
        while(i<=4)
        {
            System.out.println("Hi " + i);
            int j = 1;
            while(j<=3){
                System.out.println("Hello : "+j);
                j++;
            }
            i++;
        }
        System.out.println("Bye : "+i);

        //do while loop
        int k = 5;
        do{
            System.out.println("Testing do while loop");
        }while (k<=3);

        //for loop
        int m = 1;
        for (m =0;m<=1;m++){
            System.out.println("Testing for loop "+m);
        }
    }
}
