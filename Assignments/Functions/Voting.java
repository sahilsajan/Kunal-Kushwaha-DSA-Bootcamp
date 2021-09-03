package functions;
//Q- A person is eligible to vote if his/her age is greater than or equal to 18.
// Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class Voting {

    public static boolean checkVote(int age){
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println("The boolean value for that person to vote is: " + checkVote(age));
    }
}
