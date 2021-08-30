package conditionalsandloops;
//Q-Given an integer number n, return the difference between the product of its digits and the sum of its digits.
//Leetcode question 1281

public class Solution {
        public static int subtractProductAndSum(int n) {
            int number = n;
            int product = 1;
            int sum = 0;
            while(number > 0){
                int a = number % 10;
                product *= a;
                number /= 10;
            }
            int num2 = n;
            while(num2 > 0){
                int a = num2 % 10;
                sum += a;
                num2 /= 10;
            }
            int result = product - sum;
            return result;
        }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(1234));
    }
}
