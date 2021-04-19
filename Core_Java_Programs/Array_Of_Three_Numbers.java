import java.util.*;

public class ArrayOf3x3Number {
    public static void main(String[] args){
        int a,b;
        int num[][]=new int[3][3];
        Scanner sc=new Scanner(System.in);

        for(a=0;a<3;a++){
            for(b=0;b<3;b++){
                System.out.println("Enter any number : ");
                num[a][b]=sc.nextInt();
            }
        }

        for(a=0;a<3;a++){
            for(b=0;b<3;b++){
                System.out.print("\t"+num[a][b]);
            }
            System.out.println();
        }
    }
}