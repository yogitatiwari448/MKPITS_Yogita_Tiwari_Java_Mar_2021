import java.util.*;

public class CheckEnteredNumberIsStrongNumberOrNot {
    public static int fact(int r)
    {
        int mul=1;
        for(int i=1;i<=r;i++)
        {
            mul=mul*i;
        }
        return mul;
    }

    public static void main(String[] args)
    {
        int n;
        int sum=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        n=sc.nextInt();
        int k=n;
        int r;
        while(k!=0)
        {
            r=k%10;
            int f=fact(r);
            k=k/10;
            sum=sum+f;
        }
        if(sum==n)
        {
            System.out.println("Number is a strong number");
        }
        else
        {
            System.out.println("Number is not a strong number");
        }
    }
}