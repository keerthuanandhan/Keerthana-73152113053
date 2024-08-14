package Lab;
import java.util.*;
class Animals2{
	final int n=20;
	void move() {
		System.out.println("Animals are moving");
	}
	void eat() {
		System.out.println("Animals are eating");
	}
}
class Dog3 extends Animals2{
	
	void move() {
		System.out.println("Dog will walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}
final class cat{
	final void meow() {
		System.out.println("Meow");
	}
}
public class sample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animals2 animal;
        animal=new Dog3();  //DMD
        animal.move();
        animal.eat();
        System.out.println(animal.n);
	}

}
