package conditionalsandloops.advanced;
//Q- Calculate average of N numbers

import java.util.Scanner;

public class NAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many total numbers are there?: ");
        int count = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= count; i++){
            System.out.print("Enter " + i + "th number: ");
            sum += sc.nextInt();
        }
        double average = (double)sum / (double)count;

        System.out.print("The average of all those numbers is: " + average);
    }
}
