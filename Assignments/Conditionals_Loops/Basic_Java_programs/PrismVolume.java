package conditionalsandloops;
//Q-Volume Of Prism

import java.util.Scanner;

public class PrismVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();

        int volume = base * height;
        System.out.print("The volume of prism is " + volume);
    }
}
