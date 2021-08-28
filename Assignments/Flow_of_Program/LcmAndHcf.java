package flowofprogram;

import java.util.Scanner;

//Q-Take 2 numbers as inputs and find their HCF and LCM.
public class LcmAndHcf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find its LCM and HCF");
        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = sc.nextInt();

        //to find HCF-
        int minNum = Math.min(num1,num2);
        int hcf = 1;
        for(int i = 2; i <= minNum; i++){
            if(num1 % i == 0 && num2 % i == 0){
                hcf = i;
            }
        }
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        //to find lcm-
        int maxPossibleMultiple = num1 * num2;
        int maxNum = Math.max(num1, num2);
        int lcm = maxPossibleMultiple;
        for(int i = maxPossibleMultiple - 1; i >= maxNum; i--){
            if(i % num1 == 0 && i % num2 == 0){
                lcm = i;
            }
        }
        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

    }
}

