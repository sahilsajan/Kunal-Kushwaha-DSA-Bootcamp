package conditionalsandloops;
//Q- Area Of Circle Java Program

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        double pi = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        if(radius <= 0){
            System.out.println("Radius cannot be negative or zero");
            return;
        }
        System.out.print("The area of circle is: ");
        double area = pi * radius * radius;
        System.out.print(area);
    }
}
