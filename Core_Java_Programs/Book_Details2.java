public class Book {
    String bookname;
    String author;

    //creating constructor
    public Book(String b, String a) {
        bookname = b;
        author = a;
    }//creating constructor to copy value in another object

    public Book(Book bo) {
        bookname = bo.bookname;
        author = bo.author;
    }

    public void displaydata() {
        System.out.println("bookname = " + bookname );
        System.out.println( " : author = " + author);
    }
}
     class Book1{
        public static void main(String[] arg)
        {
            //creating object
            Book b=new Book("oracle","richard");
            Book b1=new Book (b);
            b.displaydata();
            b1.displaydata();
        }
    }