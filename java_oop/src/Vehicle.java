public class Vehicle {
	

public String type;
public int age;
public String color;

public String getType(){
     return type;
}
public int getAge(){
     return age;
}
public String getColor(){
     return color;
}
public void setType(String typeval){ 
	type= typeval;
}
public void setAge(int ageval){ 
	age = ageval;
}
public void setColor(String colorval){ 
	color =colorval;
}
public int getNumberOfSeats(){
     if (type.equals("Car")){
return 5; 
}
     else if (type.equals("Bus")){
         return 20;
}
else if (type.equals("Motorcycle")){ 
	return 1;
}
return 0;
}
public boolean isSameType(Vehicle v2){ 
	
	if (this.type.equals(v2.type)) { //this kullanmayı unutma!!!!
		return true;}
	else {
		return false;}
}

}