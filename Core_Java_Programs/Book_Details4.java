import java.util.*;
public class BookEx {
    String name;
    String author;
     public BookEx(String n,String a)
     {
         name=n;
         author=a;
     }
     void displaydata()
     {
         System.out.println("Book name is = " + name);
         System.out.println("Book author = " +author);
     }
}
class testBook {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        Book b[] = new Book[3];
        String n;
        String a;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter book name and author");
            n = sc.next();
            a = sc.next();
        }
        //display
        for (int i = 0; i < 3; i++)
        {
            b[i].displaydata();
        }

    }
}