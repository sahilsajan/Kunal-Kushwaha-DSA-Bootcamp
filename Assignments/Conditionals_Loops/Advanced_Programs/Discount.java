package conditionalsandloops.advanced;
//Q- Calculate discount of the product

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double original = sc.nextDouble();
        System.out.print("Enter discounted price: ");
        double discount = sc.nextDouble();

        double discountCalculated = ((original - discount) / original) * 100;
        System.out.print("The discount was: " + discountCalculated + "%");
    }
}
