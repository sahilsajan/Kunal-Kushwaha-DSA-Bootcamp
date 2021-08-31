package conditionalsandloops.advanced;

import java.util.Scanner;

//Q-reverse a string
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sentence to reverse: ");
        String input = sc.nextLine();
        for(int i = input.length()-1; i >= 0; i--){
            System.out.print(input.charAt(i));
        }
    }
}
