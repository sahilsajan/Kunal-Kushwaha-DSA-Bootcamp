package conditionalsandloops.advanced;

import java.util.Scanner;

//Q-find HCF and LCM of a number
public class HcfAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number one: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number two: ");
        int num2 = sc.nextInt();

        int max = Math.max(num1, num2);
        int hcf = 1;
        int lcm = num1 * num2;
        for(int i = 1; i <= max; i++){
            if((num1 % i == 0) && (num2 % i == 0)){
                hcf = i;
            }
        }
        for(int i = lcm; i >= max; i--){
            if((i % num1 == 0) && (i % num2 == 0)){
                lcm = i;
            }
        }

        System.out.println("LCM: "+ lcm + " HCF: " + hcf);

    }
}
