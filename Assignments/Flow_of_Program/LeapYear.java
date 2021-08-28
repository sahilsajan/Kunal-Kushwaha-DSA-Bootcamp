package flowofprogram;
//Q-Input a year and find whether it is a leap year or not.

import java.util.Scanner;

    public class LeapYear {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Program to check whether a given year is leap year or not");
            System.out.print("Enter the year: ");
            int year = sc.nextInt();
            //for the input to be a leap year, if it is a century year (ends with 00), then it needs to
            //be divisible by both 4 and 400, if it is not a century year, it only needs to be divisible by 4.

            if(year % 100 == 0){
                if(year % 4 == 0 && year % 400 == 0){
                    System.out.println("The year " + year + " is a leap year!");
                }
                else {
                    System.out.println("the year " + year + " is not a leap year!");
                }
            }else{
                if(year % 4 == 0){
                    System.out.println("The year " + year + " is a leap year!");
                }else {
                    System.out.println("the year " + year + " is not a leap year!");
                }
            }

        }
    }
