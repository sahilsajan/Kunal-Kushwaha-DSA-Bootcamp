package conditionalsandloops.advanced;
//Q-Calculate Electricity Bill

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total Kilowatts used: ");
        int kilowatts = sc.nextInt();
        System.out.print("Enter total hours a month used: ");
        int hours = sc.nextInt();
        System.out.print("Enter cost per kilowatt: ");
        int cost = sc.nextInt();

        int total = kilowatts * hours * cost;
        System.out.print("total electricity bill amount is: " + total);
    }
}
