package Training;
import java.util.*;
class Vehicle1{
	public void drive() {
		System.out.println("Drive the vehicle");
	}
}
class Car extends Vehicle1{
	public void drive() {
		System.out.println("Repairing a car");
	}
}
public class java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Vehicle1 v=new Vehicle1();
        Vehicle1 c=new Car();
        v.drive();
        c.drive();
	}

}
