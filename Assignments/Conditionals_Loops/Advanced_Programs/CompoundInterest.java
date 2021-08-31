package conditionalsandloops.advanced;
//Q-Compound Interest Java Program

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double p = sc.nextFloat();
        System.out.print("Enter interest rate: ");
        double r = sc.nextFloat();
        System.out.print("Enter number of times applied per period: ");
        double n = sc.nextFloat();
        System.out.print("Enter number of time periods elapsed: ");
        double t = sc.nextFloat();

        double a = p * Math.pow((1 + (r / n)), n * t);
        System.out.print("The Compound interest is : " + a);

    }
}
