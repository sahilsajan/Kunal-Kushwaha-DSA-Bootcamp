package conditionalsandloops;
//Q-Area Of Rectangle Program
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of height: ");
        double height = sc.nextDouble();
        System.out.print("Enter the length of base: ");
        double base = sc.nextDouble();
        System.out.print("The area of the rectangle is: ");
        double area = 2 * (height * base);
        System.out.print(area);
    }
}
