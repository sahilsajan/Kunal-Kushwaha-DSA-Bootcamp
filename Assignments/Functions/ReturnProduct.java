package functions;
//Q- Define a method that returns the product of two numbers entered by user.

import java.util.Scanner;

public class ReturnProduct {
    public static int product(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number two: ");
        int num2 = sc.nextInt();

        System.out.println("the product is: " + product(num1, num2));

    }
}
