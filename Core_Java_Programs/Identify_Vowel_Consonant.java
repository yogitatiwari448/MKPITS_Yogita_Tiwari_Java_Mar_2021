//Write a java program to check whether an alphabet is a vowel or consonant//

import java.util.*;
public class VowelOrConsonent {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        char ch;
        char lowercase_vowel, uppercase_vowel;
        System.out.println("Enter any alphabet");
        ch = sc.next().charAt(0);


        if  (ch == 'a'  || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
              {
                System.out.println(  " is vowel " );
            }
             else {
                System.out.println(" is a consonent" );
            }

    }
}