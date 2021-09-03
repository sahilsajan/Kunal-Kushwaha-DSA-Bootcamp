package functions;
//Q-Write a program to print the circumference and area
// of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class Circumference {

    public static void printCircumferenceAndArea(float radius){
        float pi = 3.14f;
        float circumference = 2 * pi * radius;
        float area = pi * radius * radius;
        System.out.println("circumference is: " + circumference);
        System.out.println("Area is: " + area);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        float radius = sc.nextFloat();
        printCircumferenceAndArea(radius);
    }
}
