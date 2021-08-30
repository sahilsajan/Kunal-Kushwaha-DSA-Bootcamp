package conditionalsandloops.basic;
//Q-Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)

import java.util.Scanner;

public class LargestOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = Integer.MIN_VALUE;

        while(true){
            int number = sc.nextInt();
            if(number == 0){
                break;
            }
            if(number > largest){
                largest = number;
            }
        }
        System.out.print("The largest number among those input is: " + largest);
    }
}
