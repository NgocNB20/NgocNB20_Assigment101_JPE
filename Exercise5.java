package exercise;

import java.util.Scanner;
import java.lang.Math;
public class Exercise5 {
    public static void main(String[] args) {
        System.out.println("input radius of the circle :");
        Scanner sc =new Scanner(System.in);
        double Radius = sc.nextDouble();
        System.out.println("Perimeter is :"+Math.PI*2*Radius);
        System.out.println("Area is :"+Math.PI*Math.pow(Radius,2));
    }
}
