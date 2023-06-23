package labb06;

public class Circle {
	
	public double PI=3.14; 
	protected double radius;
	protected String color;
	
	
	
	public double  getArea() {
		double area = (this.PI*this.radius*this.radius); //find area
		System.out.println(this.getClass().getSimpleName() + " getArea method is invoked");
		System.out.println( this.getClass().getSimpleName() +" area value is: " + area);
		return area; }
	
	
	public double getRadius() {
		return radius;}
	
	public String getColor() {
		return color;}
	
	public void setRadius(double radius) {
		this.radius = radius;}
	
	public void setColor(String color) {
		this.color = color;}
	
	
	
	
	public void draw() {
		System.out.println(this.getClass().getSimpleName() + " draw method is invoked");}


	
	
	public boolean equals(Object o){
		System.out.println(this.getClass().getSimpleName()+ " equals method is invoked");
		if(o==null){
			return false;
		}
		if(o.getClass()!=this.getClass()){
			return false;
		}
		else{
			Circle cir = new Circle();
			cir=(Circle) o;
			if(cir.getRadius()==this.getRadius() &&cir.getColor().equals(this.color) ){
				return true;
			}
			else{
				return false;
			}
			
		}
	}
	public String toString(){
		return this.radius+" " + this.color; 
	}
	
}