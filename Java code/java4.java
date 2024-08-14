package Training;
import java.util.*;
class Employee1{
	public void work() {
		System.out.println("Employee is working");
	}
	public double getSalary() {
		return 50000;
	}
}
class HRManager extends Employee1{
	public void works() {
		System.out.println("HR Manager is managing human resources");
	}
	public void addEmployee(String empName) {
		System.out.println("Emplouee name: " +empName);
	}
}
public class java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HRManager h=new HRManager();
        h.work();
        double salary=h.getSalary();
        System.out.println("Salary: " +salary);
        h.addEmployee("John");
	} 

}
