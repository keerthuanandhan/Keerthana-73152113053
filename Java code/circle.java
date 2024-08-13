public class circle {
    private double radius;
    public circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        circle circle = new circle(5.0);
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);

        double circumference = circle.calculateCircumference();
        System.out.println("Circumference of the circle: " + circumference);
        circle.setRadius(7.0);
        area = circle.calculateArea();
        circumference = circle.calculateCircumference();
        System.out.println("Updated area of the circle: " + area);
        System.out.println("Updated circumference of the circle: " + circumference);
    }
}

