package Training;
import java.util.*;
class Shape {
    public double getArea() {
        return 0;
    }
}
class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return width * height;
    }
}
public class java3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(5, 10);
        double area=r.getArea();
        System.out.println("The area of the rectangle is: " +area);
	}

}
