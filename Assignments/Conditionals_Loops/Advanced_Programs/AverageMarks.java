package conditionalsandloops.advanced;

import java.util.Scanner;

//Q- Calculate average marks
public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        float num = sc.nextFloat();
        float total = 0;
        for(int i = 1; i <= num; i++){
            System.out.print("Enter marks of subject " + i);
            total += sc.nextFloat();
        }
        float average = total / num;
        System.out.print("Average of all subjects is: " + average);
    }
}
