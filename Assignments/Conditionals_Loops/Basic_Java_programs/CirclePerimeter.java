package conditionalsandloops;

import java.util.Scanner;

public class CirclePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();
        double pi = 3.14;
        double perimeter = 2 * (pi * radius);
        System.out.println("The perimeter is " + perimeter);

    }
}
