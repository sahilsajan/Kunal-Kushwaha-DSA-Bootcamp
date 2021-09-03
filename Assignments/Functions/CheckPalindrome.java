package functions;
//Q-Write a function to find if a number if palindrome or not. Take number as parameter.

import java.util.Scanner;

public class CheckPalindrome {

    public static boolean palindrome(int a){
        int num = a;
        int reverse =0;
        while(num > 0){
            int lastNum = num % 10;
            reverse = reverse * 10 + lastNum;
            num /= 10;
        }
        return reverse == a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Check number: ");
        int num = sc.nextInt();
        System.out.println(palindrome(num));
    }
}
