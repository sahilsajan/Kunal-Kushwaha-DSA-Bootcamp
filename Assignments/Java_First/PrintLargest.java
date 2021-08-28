package firstjava;
//Q-Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class PrintLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;
        while(true){
            System.out.println("Enter a number: ");
            int input = sc.nextInt();
            if(input == 0){
                break;
            }
            if(input > largest){
                largest = input;
            }
        }
        System.out.println("The largest number among all the numbers is: " + largest);
    }
}
