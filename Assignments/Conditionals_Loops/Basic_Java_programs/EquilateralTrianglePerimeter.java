package conditionalsandloops;

import java.util.Scanner;

public class EquilateralTrianglePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;
        System.out.println("The perimeter of that equilateral triangle is " + perimeter);
    }
}
