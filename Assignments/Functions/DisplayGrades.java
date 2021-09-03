package functions;
//Q-Write a program which will ask the user to enter his/her marks (out of 100).
// Define a method that will display grades according to the marks entered as below:
// Marks Grade 91-100 AA 81-90 AB 71-80 BB 61-70 BC 51-60 CD 41-50 DD <=40 Fail

import java.util.Scanner;

public class DisplayGrades {

    public static void checkGrades(int grade){
        if(grade > 90 && grade < 101){
            System.out.println("AA");
        }else if(grade > 80 && grade < 91){
            System.out.println("AB");
        }else if(grade > 70 && grade < 81){
            System.out.println("BB");
        }else if(grade > 60 && grade < 71){
            System.out.println("BC");
        }else if(grade > 50 && grade < 61){
            System.out.println("CD");
        }else if(grade > 40 && grade < 51){
            System.out.println("DD");
        }else{
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage out of 100: ");
        int grade = sc.nextInt();
        checkGrades(grade);
    }
}
