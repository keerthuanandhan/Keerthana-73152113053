package Training;
import java.util.*;
class A{
	int a=10;
	A(String name){
		System.out.println("Welcome " +name);
	}
	void myMethod1() {
		System.out.println("I am super class method");
	}
}
class B extends A{
	B(){
		super("Keerthana");
	}
	void myMethod2() {
		System.out.println("Super class variable: " +super.a);
	}
}
public class sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        B obj=new B();
        obj.myMethod2();
	}

}
