package conditionalsandloops.advanced;

import java.util.Scanner;

//Q- Find sum of N numbers
public class SumNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of additions: ");
        int num = sc.nextInt();
        int start = 1;
        int sum = 0;
        while(start <= num){
            System.out.print("Enter number " + start);
            sum += sc.nextInt();
            start++;
        }
        System.out.print("Total sum is: " + sum);
    }
}
