//Array of 2rows*3columns//
import java.util.*;
public class TwoRowsThreeColum {
    public static void main(String[] args)
    {
        String name[][]={{"monika","sagar","namita"},{"anuroop","anurag","nilima"}};
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + name[i][j]);
            }System.out.println();
        }

    }
}