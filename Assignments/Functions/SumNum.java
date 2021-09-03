package functions;

import java.util.Scanner;

//Q-Write a program to print the sum of two numbers entered by user by defining your own method.
public class SumNum {

    public static int sum(int a , int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number two: ");
        int num2 = sc.nextInt();

        System.out.println("the sum is: " + sum(num1, num2));

    }
}
