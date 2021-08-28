package firstjava;

import java.util.Scanner;

//Q-Input currency in rupee and output in dollar.
public class RupeeToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount in rupees: ");
        int rupee = sc.nextInt();
        System.out.print("Amount in USD is: ");
        double dollar = rupee / 73.50;
        System.out.print(dollar);
    }
}
