/*Write a program in C to display the pattern like right angle triangle using an asterisk.
        The pattern like :
        *
        **
        ***
        ****
 */

//import java.util.*;
public class Pattern {
    public static void main(String[] arg) {
        //Scanner sc = new Scanner(System.in);
        int rowcount, colcount;
        for (rowcount = 1; rowcount <= 4; rowcount++) {
            for (colcount = 1 ; colcount <= rowcount; colcount++)
            {
                System.out.print("* \t");

            }System.out.println();
        }
    }
}