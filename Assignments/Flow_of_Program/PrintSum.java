package flowofprogram;

import java.util.Scanner;

//Q-Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
public class PrintSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter a number you want to add, or press x to exit and view sum: ");
            char input = sc.next().charAt(0);
            if(input == 'x'){
                break;
            }else {
                sum += Character.getNumericValue(input);
            }
        }
        System.out.println("Sum of numbers is: " + sum);
    }
}
