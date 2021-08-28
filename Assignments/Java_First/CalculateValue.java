package firstjava;
//Q-Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class CalculateValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operation (+,-,*,/): ");
        char operator = sc.next().trim().charAt(0);
        int result;
        if(operator == '+'){
            result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }else if(operator == '-'){
            result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        }else if(operator == '*'){
            result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        }
        else if(operator == '/'){
            result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }else{
            System.out.println("Not a valid operation, please try again!");
        }
    }
}
