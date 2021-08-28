package conditionalsandloops;

import java.util.Scanner;

public class EquilateralTriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base length: ");
        double base = sc.nextDouble();
        System.out.print("Enter height length: ");
        double height = sc.nextDouble();
        double area = 0.5 * (base * height);
        System.out.println("The area of Equilateral Triangle is " + area);
    }
}
