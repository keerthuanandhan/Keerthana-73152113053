public class Employee {
    private String name;
    private String jobTitle;
    private double salary;
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calculateRaise(double percentage) {
        return salary + (salary * percentage / 100);
    }
    public void updateSalary(double newSalary) {
        setSalary(newSalary);
        System.out.println("Updated salary: " + salary);
    }
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Salary: " + salary);
    }
    public static void main(String[] args) {
        Employee emp= new Employee("John Doe", "Software Engineer", 70000);
        System.out.println("Initial Employee Details:");
        emp.displayEmployeeDetails();
        double newSalary = emp.calculateRaise(10);
        System.out.println("\nSalary after 10% raise: " + newSalary);
        emp.updateSalary(newSalary);
        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployeeDetails();
    }
}

