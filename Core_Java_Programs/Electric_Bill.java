import java.util.*;

public class CalculationForElectricBill {
    public static void main(String[] args)
    {
        int cid,uc;
        float total=0;
        String name;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the customer name : ");
        name=sc.next();
        System.out.println("Enter the customer ID : ");
        cid=sc.nextInt();
        System.out.println("Enter Units consumed : ");
        uc=sc.nextInt();

        if(uc<200)
        {
            total=(float)uc*1.20f;
        }
        else if(uc>=200 && uc<400)
        {
            total=(float)uc*1.50f;
        }
        else if(uc>=400 && uc<600)
        {
            total=(float)uc*1.80f;
        }
        else if(uc>=600)
        {
            total=(float)uc*2.0f;
        }
        System.out.println("Total before surcharge and min bill = "+total);

        if(total<100)
        {
            total=100;
        }
        else if(total>400)
        {
            total= (float) ( total+(total*0.15));
        }

        System.out.println("Customer name : "+name);
        System.out.println("Customer ID : "+cid);
        System.out.println("Total Amount : "+total+" Rs.");
    }
}