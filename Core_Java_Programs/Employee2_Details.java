import java.util.*;

public class Employee {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    employee e1=new employee();

    e1.getemployeedata("Yogita",123,10000,"CSR");
    e1.displayemployeedata();
    }
    static class employee{
        String empname;
        int empno;
        int salary;
        String designation;

        void getemployeedata(String en,int eno,int s,String d){
            empname=en;
            empno=eno;
            salary=s;
            designation=d;
        }
        void displayemployeedata(){
            System.out.println("Employee name : "+empname);
            System.out.println("Employee number : "+empno);
            System.out.println("Employee salary : "+salary);
            System.out.println("Employee designation : "+designation);
        }
    }
}