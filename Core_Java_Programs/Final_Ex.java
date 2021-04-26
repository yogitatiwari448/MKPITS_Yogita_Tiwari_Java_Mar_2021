//Final Keyword ex//
class Calculate{
    int cube(final int n)
    {
        //n = n + 2; //can't be changed as n is final
        return n*n*n;
    }


    public static void main(String[] args) {
         b Calculate= new Calculate();
        System.out.println(b.cube(5));

    }
}