package functions;
//Q- Define two methods to print the maximum and the
// minimum number respectively among three numbers entered by user.

public class MaxMin {

    public static int max(int a, int b, int c){
        return Math.max(a,Math.max(b, c));
    }
    public static int min(int a, int b, int c){
        return Math.min(a,Math.min(b, c));
    }

    public static void main(String[] args) {
        System.out.println("max: " + max(1,2,3));
        System.out.println("min: " +min(1,2,3));
    }
}
