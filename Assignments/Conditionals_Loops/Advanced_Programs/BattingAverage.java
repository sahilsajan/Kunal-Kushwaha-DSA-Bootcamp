package conditionalsandloops.advanced;
//Q-Calculate the batting average

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of batsmen: ");
        double batsmen = sc.nextInt();
        double total = 0;
        for(int i = 1; i <= batsmen; i++){
            System.out.print("Enter runs scored by batsman " + i +": ");
            total += sc.nextDouble();
        }
        double average = (total / batsmen);
        System.out.print("The average runs are: " + average);
    }
}
