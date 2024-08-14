package Lab;
import java.util.*;
class Animal1{
	void move() {
		System.out.println("Animals are moving");
	}
	void eat() {
		System.out.println("Animals are eating");
	}
}
class Dog1 extends Animal1{
	void move() {
		System.out.println("Dog will walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}
public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal1 a;
        a=new Dog1();  //DMD
        a.move();
        a.eat();
        
	}

}
