package exercise;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        System.out.println("input width of the rectangle :");
        Scanner sc =new Scanner(System.in);
        double Width = sc.nextDouble();
        System.out.println("input Height of the rectangle :");
        double Height = sc.nextDouble();
        System.out.println("Area is :"+(Width*Height));
        System.out.println("Perimeter is :"+(Width+Height)*2);

    }
}
