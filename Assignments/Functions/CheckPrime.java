package functions;

import java.util.Scanner;

//Q-Define a method to find out if number is prime or not.
public class CheckPrime {

    public static boolean prime(int num){
        int check = 2;
        boolean ans = true;
        while(check < num){
            if(num % check == 0){
                ans = false;
                break;
            }
            check++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int num = sc.nextInt();
        System.out.print(prime(num));

    }
}
