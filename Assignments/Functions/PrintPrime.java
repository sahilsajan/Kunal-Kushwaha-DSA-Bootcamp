package functions;
//Q-Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class PrintPrime {
    public static void prime(int a, int b){
        while(a <= b){
            boolean isPrime = true;
            for(int i = 2; i < a; i++){
                if(a % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime && a != 1){
                System.out.println(a);
            }
            a++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        prime(start, end);
    }
}
