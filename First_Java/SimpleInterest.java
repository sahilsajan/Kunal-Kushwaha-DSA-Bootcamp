package firstjava;
// Q-Write a program to input principal, time and rate (P, T, R) from user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the time: ");
        double time = sc.nextDouble();
        System.out.print("Enter the rate in decimal: ");
        double rate = sc.nextDouble();
        double si = principal * (1 + (rate * time));
        System.out.print("The Simple Interest is: " + si);
    }
}
