package patterns;
//Q-  *
//    **
//    ***
//    ****
//    *****
//    *****
//    ****
//    ***
//    **
//    *
public class Pattern5 {
    public static void main(String[] args) {
        //first half of the pattern
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half of the pattern
        for(int i = 5; i >= 1; i--){
            for(int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
