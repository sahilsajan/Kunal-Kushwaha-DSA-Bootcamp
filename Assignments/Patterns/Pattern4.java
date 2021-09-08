package patterns;
//Q-  1
//    1 2
//    1 2 3
//    1 2 3 4
//    1 2 3 4 5

public class Pattern4 {
    public static void main(String[] args) {
        for(int i = 0; i <= 4; i++){
            int num = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
