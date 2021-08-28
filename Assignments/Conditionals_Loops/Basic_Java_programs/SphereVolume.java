package conditionalsandloops;
//Q-Volume of sphere in java

import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double constant = 4.0/3.0;

        double volume = constant * pi * (radius * radius * radius);
        System.out.println("The volume is " + volume);

    }
}
