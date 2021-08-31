package conditionalsandloops.advanced;
//Q-Check if a number is an armstrong number or not

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = sc.nextInt();
        int check = num;
        int sum = 0;
        while(check > 0){
            int last = check % 10;
            sum = (int) (sum + Math.pow(last, 3));
            check /= 10;
        }
        if(sum == num){
            System.out.print("It is an armstrong number");
        }else{
            System.out.print("It isn't an armstrong number");
        }
    }
}
