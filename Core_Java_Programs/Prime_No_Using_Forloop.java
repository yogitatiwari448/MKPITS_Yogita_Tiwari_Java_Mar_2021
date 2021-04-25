//The prime number between 1 and 50 are :2 3 5 7 11 13 17 19 23 29 31 37 41 43 47//
//import java.util.*;
public class WithinRangePrimeNo {
    public static void main(String[] arg)
    {
        //Scanner sc=new Scanner(System.in);
        int i, j;
        for(i=2;i<50;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i==j)
                    System.out.println( + i );
                else if( i % j ==0)
                break;

            }
        }
    }
}