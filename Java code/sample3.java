package Lab;
import java.util.*;
class Animals1{
	int n=20;
	void move() {
		System.out.println("Animals are moving");
	}
	void eat() {
		System.out.println("Animals are eating");
	}
}
class Dog2 extends Animals1{
	int n=20;
	void move() {
		System.out.println("Dog will walk");
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}
public class sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animals1 animal;
        animal=new Dog2();  //DMD
        animal.move();
        animal.eat();
        System.out.println(animal.n);
	}

}
