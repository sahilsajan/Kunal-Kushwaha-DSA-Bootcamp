package conditionalsandloops.advanced;
//Q-Calculate CGPA Java Program

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of semesters: ");
        double semesters = sc.nextDouble();
        double total = 0;
        for(int i = 1; i <= semesters; i++){
            System.out.print("Enter GPA for " + i + "th semester: ");
            total += sc.nextDouble();
        }
        double CGPA = total / semesters;
        System.out.print("The students CGPA is: " + CGPA);
    }
}
