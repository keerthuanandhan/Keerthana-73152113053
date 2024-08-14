package Training;
import java.util.*;
class Person {
    private String firstName;
    private String lastName;
    public Person(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
}
class Employees extends Person {
    private String jobTitle;
    private int employeeId;
    public Employees(String firstName,String lastName,String jobTitle,int employeeId) {
        super(firstName,lastName);
        this.jobTitle=jobTitle;
        this.employeeId=employeeId;
    }
    public String getLastName() {
        return super.getLastName()+"("+ jobTitle+")";
    }
    public int getEmployeeId() {
        return employeeId;
    }
}
public class java7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employees e=new Employees("John","Doe","Manager",12345);
        System.out.println("First Name: " +e.getFirstName());
        System.out.println("Last Name: " +e.getLastName());
        System.out.println("Employee ID: " +e.getEmployeeId());
	}

}
