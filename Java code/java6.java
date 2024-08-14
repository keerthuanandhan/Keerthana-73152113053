package Training;
import java.util.*;
class Animal1 {
    public void move() {
        System.out.println("The animal moves in some way.");
    }
}
class Cheetah extends Animal1 {
    public void move() {
        System.out.println("The cheetah runs swiftly.");
    }
}
public class java6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Animal1 a=new Animal1();
		 Animal1 c=new Cheetah();
		 a.move();
		 c.move();
	}

}
