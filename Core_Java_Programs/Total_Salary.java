import java.util.Scanner;

public class Salary
{
    public static void main(String[] args){
        int sa,ts=0,cnt=1;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Enter The Salary : ");
            sa=sc.nextInt();
            ts = ts + sa;
            cnt++;
        } while (cnt <= 5);
        System.out.println("Total Salary is : "+ts);
    }
}