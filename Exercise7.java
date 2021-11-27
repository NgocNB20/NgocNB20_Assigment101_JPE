package exercise;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println("Input first integer :");
        Scanner sc =new Scanner(System.in);
        int FirstNumber = sc.nextInt();
        System.out.println("Input second integer :");
        int SecondNumber = sc.nextInt();
        if(FirstNumber == SecondNumber){
            System.out.println(FirstNumber+"="+SecondNumber);
        }
       else if(FirstNumber < SecondNumber){
            System.out.println(FirstNumber+"!="+SecondNumber);
            System.out.println(FirstNumber+"<"+SecondNumber);
            System.out.println(FirstNumber+"<="+SecondNumber);
        } else {
            System.out.println(FirstNumber+"!="+SecondNumber);
            System.out.println(FirstNumber+">"+SecondNumber);
            System.out.println(FirstNumber+">="+SecondNumber);


        }



    }
}
