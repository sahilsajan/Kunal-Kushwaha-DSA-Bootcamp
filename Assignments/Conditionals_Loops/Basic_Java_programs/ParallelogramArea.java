package conditionalsandloops;
import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of height: ");
        double height = sc.nextDouble();
        System.out.print("Enter the length of base: ");
        double base = sc.nextDouble();
        System.out.print("The area of the parallelogram is: ");
        double area = height * base;
        System.out.print(area);

    }


}

