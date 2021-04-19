import java.util.*;

public class Employee {
    public static void main(String[] args) {
        float salary[]=new float[10];
        int cnt,a;
        Scanner sc=new Scanner(System.in);

        for(cnt=0;cnt<10;cnt++)
        {
            System.out.println("Enter the salary of "+cnt+" : ");
            salary[cnt]=sc.nextFloat();
        }

        for(cnt=0;cnt<10;cnt++)
        {
            System.out.println("Salary of "+cnt+" = "+salary[cnt]);
        }
    }
}