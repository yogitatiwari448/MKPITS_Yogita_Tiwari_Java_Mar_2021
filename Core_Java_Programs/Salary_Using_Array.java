import java.util.*;

public class Salary {
    public static void main(String[] args) {
        float salary[]=new float[5]; 
        int cnt;
        float sum=0.0f;
        float avg=0.0f;
        Scanner sc=new Scanner(System.in);

        for(cnt=0;cnt  < 5 ; cnt++)
        {
            System.out.println("enter salary of employee "+cnt);
            salary[cnt]=sc.nextFloat();
            sum=sum + salary[cnt];
        }
        System.out.println("total salary = "+sum);
        avg=sum / 5;
        System.out.println("average salary "+avg);
    }
}