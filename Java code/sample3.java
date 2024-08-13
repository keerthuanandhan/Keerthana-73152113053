package Training;
import java.util.*;
class Vehicles{
	void noOfEngine() {
		System.out.println("I have one Engine");
	}
}
class TwoWheeler1 extends Vehicles{
	void noOfWheeles() {
		System.out.println("I have two wheeler");
	}
}
class Bike2 extends TwoWheeler1{
	void brandName() {
		System.out.println("Brand name is Honda");
	}
}
class Scooty extends TwoWheeler1{
	void brandname() {
		System.out.println("Brand name in Activa");
	}
}
	
public class sample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bike2 b=new Bike2();
        b.noOfEngine();
        b.noOfWheeles();
        b.brandName();
        
        Scooty s=new Scooty();
        s.noOfEngine();
        s.noOfWheeles();
        s.brandname();
	}

}

