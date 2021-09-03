package functions;
//Q-Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class SumNNumbers {

    public static int sum(int n){
        int start = 0;
        int sum = 0;
        while(start <= n){
            sum += start;
            start++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.println("Sum is: " + sum(num));
    }

}
