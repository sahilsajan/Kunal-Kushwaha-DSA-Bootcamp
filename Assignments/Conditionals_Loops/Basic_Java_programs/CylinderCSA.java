package conditionalsandloops;
//Q-Find curved surface area of cylinder

import java.util.Scanner;

public class CylinderCSA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double csa = 2 * pi * radius * height;
        System.out.println("The curved surface area is: " + csa);
    }
}
