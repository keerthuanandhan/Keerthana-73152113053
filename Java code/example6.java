public class example6 {
    example6(String name){
    	System.out.println("Welcome " +name);
    }
    example6(int a,int b){
    	this("keerthana");
    	System.out.println("Sum: " +(a+b));
    }
    example6(int n){
    	this(10,20);
    	System.out.println("Sum: " +(n+n));
    }
	public static void main(String[] args) {
		example6 obj=new example6(5);
		
	}
}
