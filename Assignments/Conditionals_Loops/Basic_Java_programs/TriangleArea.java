package conditionalsandloops;
//Q-Area Of Triangle
import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the height of triangle: ");
        double height = sc.nextDouble();
        System.out.print("Enter the length of the base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("The area of the triangle is: ");
        double area = 0.5 * base * height;
        System.out.print(area);
    }
}
