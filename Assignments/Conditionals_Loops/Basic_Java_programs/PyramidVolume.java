package conditionalsandloops;
//Q- java code for volume of pyramid
import java.util.Scanner;

public class PyramidVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter base length: ");
        double length = sc.nextDouble();
        System.out.print("enter base width: ");
        double width = sc.nextDouble();
        System.out.print("enter height: ");
        double height = sc.nextDouble();

        double volume = (length * width * height) / 3.0;
        System.out.println("Volume is " + volume);

    }
}
