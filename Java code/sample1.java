package Lab;
import java.util.*;
class Animal{
	void move() {
		System.out.println("Animals are moving");
	}
	void eat() {
		System.out.println("Animals are eating");
	}
}
class dog extends Animal{
	void move() {
		System.out.println("Dog will walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}
public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        dog d=new dog();
        d.move();
        d.eat();
	}

}
