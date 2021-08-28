package conditionalsandloops;

import java.util.Scanner;

public class SquarePerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of side: ");
        double length1 = sc.nextDouble();

        double perimeter = 4 * length1;
        System.out.println("The perimeter of square is " + perimeter);
    }
}
