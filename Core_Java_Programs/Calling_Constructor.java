public class Constructor {
    static class Student
    {
        //creating default costructor
        public Student()
        {
            System.out.println("hello from default constructor");
        }
        //creating a parameterised constructor
        public Student(int r)
        {
            this();//calling default constructor
            System.out.println("rno = " + r);
        }
    }

    public static class This {
        public static void main(String[] args){
            Student s=new Student(55);
        }
    }
}