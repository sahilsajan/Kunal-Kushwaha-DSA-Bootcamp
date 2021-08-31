package conditionalsandloops.advanced;

import java.util.Scanner;

//Q- Power in java
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        double base = sc.nextDouble();
        System.out.print("Enter the exponential value: ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.print("The value is: " + result);
    }
}
