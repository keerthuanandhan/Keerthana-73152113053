public class example5 {
    void mymethod(String name) {
    	System.out.println("Welcome " +name);
    }
    void mymethod(int a, int b) {
    	System.out.println("Sum: " +(a+b));
    }
    void mymethod(int n) {
    	System.out.println("Sum: " +(n+n));
    }
	public static void main(String[] args) {

        example5 obj=new example5();
        obj.mymethod(5);
        obj.mymethod("Keerthana");
        obj.mymethod(10, 20);
	}
}
