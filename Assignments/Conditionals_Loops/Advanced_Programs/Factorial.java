package conditionalsandloops.advanced;
//Q-Factorial Program In Java

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth index: ");
        int num = sc.nextInt();
        int value = num;
        int first = 0;
        int second = 1;
        while(num > 2){
            int temp = second;
            second += first;
            first = temp;
            num--;
        }
        System.out.print("The " + value + "th fibonacci number is: " + second);
    }
}
