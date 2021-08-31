package conditionalsandloops.advanced;

import java.util.Scanner;

//Q-Find nCr and nPr
public class NcrNpr {
    public static int factorial(int num){
        int i = num;
        int ans = 1;
        while(i > 0){
            ans *= i;
            i--;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter value of r: ");
        int r = sc.nextInt();

        int npr = factorial(n)/factorial(n-r);
        int ncr = factorial(n)/(factorial(r) * factorial(n-r));
        System.out.print("The nPr is: " + npr + " and the nCr is: " + ncr);
    }
}
