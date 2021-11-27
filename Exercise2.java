package exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input first number:");
        int FirstNumber=sc.nextInt();
        System.out.println("Input second number:");
        int SecondNumber=sc.nextInt();
        System.out.println(""+FirstNumber+"+"+SecondNumber+"="+(FirstNumber+SecondNumber));
        System.out.println(""+FirstNumber+"-"+SecondNumber+"="+(FirstNumber-SecondNumber));
        System.out.println(""+FirstNumber+"*"+SecondNumber+"="+(FirstNumber*SecondNumber));
        System.out.println(""+FirstNumber+"/"+SecondNumber+"="+(FirstNumber/SecondNumber));
        System.out.println(""+FirstNumber+"%"+SecondNumber+"="+(FirstNumber%SecondNumber));

    }
}
