package conditionalsandloops.advanced;
//Q-Calculate the distance between two points

import java.util.Scanner;

public class TwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coordinates for point one (x and y respectively): ");
        double x1 = sc.nextDouble();
        double y1= sc.nextDouble();
        System.out.print("Enter coordinates for point one (x and y respectively): ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = Math.sqrt((Math.pow(x2 - x1,2.0) + Math.pow(y2 - y1,2.0)));
        System.out.print("The distance between point x and y is: " + distance);

    }
}
