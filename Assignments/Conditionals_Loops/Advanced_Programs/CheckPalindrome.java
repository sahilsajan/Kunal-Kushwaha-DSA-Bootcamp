package conditionalsandloops.advanced;
//Q-Check if a number is palindrome or not

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = sc.nextInt();
        int num1 = num;
        int reversed = 0;
        while(num1 > 0){
            int a = num1 % 10;
            reversed = reversed * 10 + a;
            num1 /= 10;
        }
        if(reversed == num){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is not palindrome");
        }

    }
}
