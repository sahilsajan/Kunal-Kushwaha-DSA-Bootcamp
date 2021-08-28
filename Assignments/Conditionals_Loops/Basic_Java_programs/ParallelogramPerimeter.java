package conditionalsandloops;

import java.util.Scanner;

public class ParallelogramPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length 1: ");
        double length1 = sc.nextDouble();
        System.out.print("Enter length 2: ");
        double length2 = sc.nextDouble();

        double perimeter = length1 + length2;
        System.out.println("The perimeter is " + perimeter);

    }
}
