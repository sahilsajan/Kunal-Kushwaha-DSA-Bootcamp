package conditionalsandloops.advanced;

import java.util.Scanner;

//Q-Sum Of A Digits Of Number
public class SumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int check = num;
        int sum = 0;
        while(check > 0){
            sum += check % 10;
            check /= 10;
        }
        System.out.println("The sum of all the digits in " + num + " is " + sum);
    }
}
