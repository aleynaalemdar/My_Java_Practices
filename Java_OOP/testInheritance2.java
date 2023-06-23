package labb06;

public class testInheritance2 {

	public static void main(String[] args) {

		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();

		Curve cr1 = new Curve();
		Curve cr2 = new Curve();
		Curve cr3 = new Curve();

		Cylinder cl1 = new Cylinder();
		Cylinder cl2 = new Cylinder();
		Cylinder cl3 = new Cylinder();
		
		c1.setRadius(5);
		c1.setColor("Red");
		c2.setRadius(5);
		c2.setColor("Red");
		c3.setRadius(4);
		c3.setColor("Blue");
		
		cr1.setRadius(5);
		cr1.setColor("Red");
		cr1.setAngle(3);
		cr2.setRadius(5);
		cr2.setColor("Red");
		cr2.setAngle(3);
		cr3.setRadius(4);
		cr3.setColor("Blue");
		cr3.setAngle(7);

		cl1.setRadius(5);
		cl1.setColor("Red");
		cl1.setHeight(6);
		cl2.setRadius(5);
		cl2.setColor("Red");
		cl2.setHeight(6);
		cl3.setRadius(4);
		cl3.setColor("Blue");
		cl3.setHeight(7);
		
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		
		System.out.println(cr1.equals(cr2));
		System.out.println(cr1.equals(cr3));
		
		System.out.println(cl1.equals(cl2));
		System.out.println(cl1.equals(cl3));
		
		System.out.println(c1);
		System.out.println(cr1);
		System.out.println(cl1);
		
	}

}