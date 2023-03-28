package labb06;

public class Curve extends Circle  {
private double angle;

public double getAngle() {
	return angle;
}


public double getArea() {
	double area = (this.angle/360)*this.PI*this.radius*this.radius ; //find area
	System.out.println(this.getClass().getSimpleName() + " getArea method is invoked");
	System.out.println(this.getClass().getSimpleName() +" area value is: " + area);
	return  area; 
}

public void setAngle(double angle) {
	this.angle = angle;
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
		Curve c  = new Curve();
		c=(Curve) o;
		if(c.getRadius()==this.getRadius() &&c.getColor().equals(this.color) && c.getAngle()==this.getAngle()){
			return true;
		}
		else{
			return false;
		}
	}
	}



	public String toString(){
		return this.radius+" " + this.color+" " + this.angle; 
	}
	

}