package firstjava;

import java.util.Scanner;

//Q-Take 2 numbers as input and print the largest number.
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = Math.max(num1, num2);
        System.out.println("The greater number between " + num1 + " and " + num2 + " is " + result);
    }
}
