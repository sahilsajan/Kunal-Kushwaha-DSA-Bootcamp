package conditionalsandloops.advanced;

import java.util.Scanner;

//Q-Calculate Depreciation of Value
public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long amount,deppercent,year,afterdep,temp;
        System.out.print("enter amount");
        amount = sc.nextLong();
        System.out.print("enter Depreciation percentage");
        deppercent = sc.nextLong();
        System.out.print("enter number of years");
        year = sc.nextLong();
        temp=amount;
        for(int i=0;i<year;i++) {
            temp = ((100 - deppercent) * temp) / 100;
        }
        System.out.println("after depreciation = "+temp);

    }
}
