import java.util.Scanner;
public class myclass1{
  public static void main(String[]args){
int employeeid;
String employeename;
float employeesalary;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the emp id: ");
employeeid=sc.nextInt();
System.out.print("Enter the emp name:");
employeename=sc.next();
System.out.print("Enter the emp salary :");
employeesalary=sc.nextFloat();
System.out.println("Employee id: "+employeeid);
System.out.println("Employee name: "+employeename);
System.out.println("Employee salary: "+employeesalary);
sc.close();
}
}