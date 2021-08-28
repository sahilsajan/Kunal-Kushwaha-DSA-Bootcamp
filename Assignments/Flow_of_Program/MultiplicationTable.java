package flowofprogram;
//Q-Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number who's multiplication table is required: ");
        int num = sc.nextInt();
        for(int i = 0; i <= 10; i++){
            int product = num * i;
            System.out.println(num + " times " + i + " = " + product);
        }
    }
}
