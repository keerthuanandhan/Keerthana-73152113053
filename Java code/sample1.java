package Training;
import java.util.*;
class TwoWheeler{
	void noOfWheels() {
		System.out.println("I have two wheeler");
	}
}
class Bike extends TwoWheeler{
	void brandName() {
		System.out.println("Brand name is Honda");
	}
}
public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bike b=new Bike();
        b.noOfWheels();
        b.brandName();
	}

}
