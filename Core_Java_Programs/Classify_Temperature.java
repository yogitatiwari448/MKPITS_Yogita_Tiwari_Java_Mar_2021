public class Temprature {
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        float temp;

        System.out.println("Enter temprature in centigrade");
        temp= sc.nextInt();

        if(temp < 0)
        {
            System.out.println("freezing weather\n");
        }
        else if(temp <= 10 && temp >=0)
        {
            System.out.println("very cold weather\n");
        }
        else if(temp <= 20 && temp >= 10)
        {
            System.out.println("cold weather\n");
        }
        else if(temp <=30 && temp >=20)
        {
            System.out.println("normal in temp\n");
        }
        else if(temp <=40 && temp >= 30)
        {
            System.out.println("its hot\n");
        }
        else if(temp >= 40)
        {
            System.out.println("its very hot\n");
        }

    }
}