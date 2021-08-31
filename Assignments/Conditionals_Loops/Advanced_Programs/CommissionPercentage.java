package conditionalsandloops.advanced;
//Q- Calculate Commission Percentage
import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of product: ");
        float price = sc.nextFloat();
        System.out.print("Enter commission taken: ");
        float commissionTaken = sc.nextFloat();
        float commission = price - (((price - commissionTaken) / price) * 100);
        System.out.print("The commission percentage was: " + commission);

    }
}
