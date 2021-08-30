package conditionalsandloops.basic;

import java.util.Scanner;

//Q-Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class SumOfAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter a number to add, or press 0 to show sum: ");
            int add = sc.nextInt();
            if(add == 0){
                break;
            }
            sum += add;
        }
        System.out.print("The sum of all numbers is: " + sum);

    }
}
