package labb06;


public class testInheritance {
public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Cylinder cylinder1 = new Cylinder();
		Curve curve1 = new Curve();
		
		curve1.setAngle(30.0);
		
		cylinder1.setHeight(10);
		
		
		cylinder1.setRadius(4);
		
		circle1.setRadius(5);
		
		curve1.setRadius(3);
		
	
		cylinder1.setColor("Blue");
		
		circle1.setColor("Yellow");
		
		curve1.setColor("Red");
		

		double height =cylinder1.getHeight();
		double height_1 = curve1.getAngle();
		
		
		double area = circle1.getArea();
		double area_2 = cylinder1.getArea();
		double area_3= curve1.getArea();
		
	
		curve1.draw();
		curve1.draw();
		curve1.draw(10);
		
		circle1.draw();
		
		cylinder1.draw();
		cylinder1.draw(20);
		
		
		
	}
	
}