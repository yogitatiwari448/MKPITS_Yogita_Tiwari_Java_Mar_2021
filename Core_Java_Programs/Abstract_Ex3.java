abstract class Bank{
    abstract int getrateofintrest();
}
class SBI extends Bank{
    int getrateofintrest()
    {
        return 7;
    }
}
class PNB extends Bank{
    int getrateofintrest()
    {
        return 8;
    }
}
public class AbstractEx3 {
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println("SBI Bank rate of intrest : " + b.getrateofintrest()+ "%");
        b=new PNB();
        System.out.println("PNB Bank rate of intrest : " + b.getrateofintrest()+ "%");
    }
}