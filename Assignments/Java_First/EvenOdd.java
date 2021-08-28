package firstjava;
//Q-Write a program to print whether a number is even or odd, also take input.

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number and we will check if it is even or odd: ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println("The number " + num + " is even!");
        }else{
            System.out.println("The number " + num + " is odd!");
        }
    }
}
