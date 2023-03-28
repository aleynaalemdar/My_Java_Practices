public class VehicleDemo {

public static void main(String[] args){
	
Vehicle v1 =new Vehicle(); Vehicle v2 =new Vehicle();

v1.setType("Car");
v1.setAge(2);
v1.setColor("Blue");
System.out.println("Number of Seats " + v1.getNumberOfSeats());

v2.setType("Bus");
v2.setAge(5);
v2.setColor("Red");
System.out.println("Number of Seats " + v2.getNumberOfSeats());

System.out.println("Are they equal: " + v1.isSameType(v2));
}}