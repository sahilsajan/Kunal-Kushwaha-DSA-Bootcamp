package conditionalsandloops;
//Q-Volume Of Cone Java Program

import java.util.Scanner;

public class ConeVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double volume = pi * (radius * radius) * (height / 3.0);
        System.out.println("The volume is: " + volume);

    }
}
