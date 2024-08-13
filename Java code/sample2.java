package Training;
import java.util.*;
class Vehicle{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}
class TwoWheelers extends Vehicle{
	void noOfWheeles() {
		System.out.println("I have two wheeler");
	}
}
class Bike1 extends TwoWheelers{
	void brandName() {
		System.out.println("Brand name is Honda");
	}
}

	
public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bike1 b=new Bike1();
        b.noOfEngine();
        b.noOfWheeles();
        b.brandName();
	}

}

