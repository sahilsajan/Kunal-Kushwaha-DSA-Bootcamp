package conditionalsandloops.advanced;

import java.util.Scanner;

//Q- Check if input char is vowel or consonant
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input char: ");
        char input = sc.next().trim().charAt(0);
        if(input == 'a' || input == 'e'|| input == 'i' || input == 'o' || input == 'u'){
            System.out.println("Character is a vowel");
        }else{
            System.out.println("Character is a consonant");
        }
    }
}
