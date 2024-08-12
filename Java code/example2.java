public class example2 {
    int b=20; //local variable
    static int c=30; // static or class variable
	public static void main(String[] args) {
		
        int a=10;
        System.out.println("Local variable: " +a);
        example2 obj=new example2();
        System.out.println(obj.b);
        System.out.println(example2.c); 
	}
}
