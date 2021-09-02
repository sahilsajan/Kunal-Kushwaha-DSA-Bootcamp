package functions;

import java.util.Scanner;

//Q- Define a program to find out whether a given number is even or odd.
public class EvenOdd {

    public static void evenOrOdd(int a){
        if(a % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        int num = sc.nextInt();
        evenOrOdd(num);
    }
}
