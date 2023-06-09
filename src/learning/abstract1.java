package learning;

//Abstract class
abstract class Shape {
	protected String color;

	public Shape(String color) {
	     this.color = color;
	}

	protected abstract double getArea();
}

	//Interface
interface Drawable {
	void draw();
}

interface GetArea{
	double getArea();
}

	//Concrete class implementing the abstract class and interface
class Circle extends Shape implements Drawable, GetArea {
	 private double radius;

	 public Circle(String color, double radius) {
	     super(color);
	     this.radius = radius;
	 }

	 public double getArea() {
	     return Math.PI * radius * radius;
	 }

	 public void draw() {
	     System.out.println("Drawing a circle");
	 }
}

public class abstract1 {
	 public static void main(String[] args) {
	     Circle circle = new Circle("Red", 5.0);
	     System.out.println("Circle color: " + circle.color);
	     System.out.printf("Circle area: %.3f \n", circle.getArea());
	     circle.draw();
	 }
}
