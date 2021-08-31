package conditionalsandloops.advanced;

import java.util.Scanner;

//Q-Addition of two numbers
public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int result = num1 + num2;
        System.out.print("The sum of " + num1 + " and " + num2 + " is: " + result);
    }
}
