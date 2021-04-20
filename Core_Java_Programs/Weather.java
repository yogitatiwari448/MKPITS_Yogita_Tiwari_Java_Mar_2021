import java.util.*;

public class TempratureClassiification {
    public static void main(String[] args)
    {
        int t;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the temprature in celcius : ");
        t=sc.nextInt();

        if(t<0)
            System.out.println("Freezing Weather");
        else if(t>=0 && t<10)
            System.out.println("Very Cold Temprature");
        else if(t>=10 && t<20)
            System.out.println("cold Weather");
        else if(t>=20 && t<30)
            System.out.println("Temprature is Normal");
        else if(t>=30 && t<40)
            System.out.println("Its Hot");
        else if(t>=40)
            System.out.println("Its Very Hot");
    }
}