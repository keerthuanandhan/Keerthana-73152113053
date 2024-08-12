class employee{
	//variables
	int employeeid;
	String employeename;
	float employeesalary;
	//constructor
	employee(int employeeid, String employeename, float employeesalary){
		this.employeeid=employeeid;
		this.employeename=employeename;
		this.employeesalary=employeesalary;
	}
	//method
	void display() {
		System.out.println("Employee id: " +employeeid);
		System.out.println("Employee name: " +employeename);
		System.out.println("Employee salary: " +employeesalary);
		
	}
}
public class example1 {
    public static void main(String[] args) {
		
        employee emp1=new employee(101,"keerthana",20000.0f);
        emp1.display();
        employee emp2=new employee(102,"vani",3000.0f);
        emp2.display();
	}
}
