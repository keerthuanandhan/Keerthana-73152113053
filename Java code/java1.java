package Training;
import java.util.*;
class Animal{
	public void makeSound() {
		System.out.println("Animal making a sound");
	}
}
class Cat extends Animal{
	public void makeSound() {
		System.out.println("Meow....");
	}
}
public class java1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal a=new Animal();
        Animal c=new Cat();
        a.makeSound();
        c.makeSound();
	}

}
