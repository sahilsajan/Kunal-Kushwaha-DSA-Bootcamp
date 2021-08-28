package firstjava;
//Q-Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        while(true){
            System.out.print("Enter a number to add or press 0 to show sum: ");
            int input = sc.nextInt();
            if(input == 0){
                break;
            }
            total += input;
        }
        System.out.println("The sum of all the numbers is: " + total);
    }
}
