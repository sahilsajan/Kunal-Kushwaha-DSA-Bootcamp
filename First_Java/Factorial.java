package firstjava;
//Q-Write a program to print factorial of a number, also take input.

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int result = 1;
        for(int i = num; i > 0; i--){
            result *= i;
        }
        System.out.println("Factorial of " + num + " is: " + result);

    }
}
