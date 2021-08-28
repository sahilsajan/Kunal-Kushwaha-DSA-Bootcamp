package conditionalsandloops;

import java.util.Scanner;

public class RhombusArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diagonal 1: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter the diagonal 2: ");
        double d2 = sc.nextDouble();
        System.out.print("The area of the rhombus is: ");
        double area = 0.5 * (d1 * d2);
        System.out.print(area);

    }


}
