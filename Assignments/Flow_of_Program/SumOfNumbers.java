package flowofprogram;
//Q-Take two numbers and print the sum of both.

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numOne = sc.nextInt();
        System.out.print("Enter the second number: ");
        int numTwo = sc.nextInt();
        int sum = numOne+numTwo;
        System.out.println("The sum of the two numbers is: " + sum);
    }
}
