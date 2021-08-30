package conditionalsandloops;
//Q- Fibonacci Series In Java Programs, find nth number in fibonacci

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = 0;
        int second = 1;
        System.out.print("Enter the nth fibonacci index: ");
        int n = sc.nextInt();
        int fibonacciNumber = n;
        while(fibonacciNumber > 2){
            int temp = second;
            second += first;
            first = temp;
            fibonacciNumber--;
        }
        System.out.println("The " + n + "th fibonacci number is: " + second);

    }
}
