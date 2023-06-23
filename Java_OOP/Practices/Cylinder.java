package labb06;
public class Cylinder extends Circle  {
private double height;

public void setHeight(double height) {
	this.height = height;
}


public double getHeight() {
	return height;
}

public double getArea() {
	double area = (2*this.PI*this.radius)*(this.height+this.radius); //finding the area
	System.out.println(this.getClass().getSimpleName() + " getArea method is invoked");
	System.out.println(this.getClass().getSimpleName()+"area value is: " + area);
	return area;

}


public void draw(int val) {
	super.draw();
	System.out.println("This method is overloaded with an int parameter the value is: " + val);
}


public void draw(double val ) {
	super.draw();
	System.out.println("This method is overloaded with an double parameter the value is: " + val);
}



public boolean equals(Object o){
	System.out.println(this.getClass().getSimpleName()+ " equals method is invoked");
	if(o==null){
		return false;
	}
	if(o.getClass()!=this.getClass()){
		return false;
	}
	else{
		Cylinder cylnd  = new Cylinder();
		cylnd=(Cylinder) o;
		if(cylnd.getRadius()==this.getRadius() &&cylnd.getColor().equals(this.color) && cylnd.getHeight()==this.getHeight()){
			return true;
		}
		else{
			return false;
		}
	}
	}
	

public  String toString() {
	return this.radius+" " + this.color+" " + this.height;
}
	
}
