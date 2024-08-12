public class example3 {
    void mymethod() {
    	System.out.println("Insatnce method");
    }
    static void mymethod2() {
    	System.out.println("Static method");
    }
	public static void main(String[] args) {
		
        example3 obj=new example3();
        obj.mymethod();
        example3.mymethod2();
	}

}
