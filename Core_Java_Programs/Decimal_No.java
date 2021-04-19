import java.util.*;

public class DecimalNoArray3x3 {
    public static void main(String[] args)
    {
        float[][] num=new float[3][3];
        int i,j;
        Scanner sc=new Scanner(System.in);

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("Enter any decimal number : ");
                num[i][j]=sc.nextFloat();
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
    }
}