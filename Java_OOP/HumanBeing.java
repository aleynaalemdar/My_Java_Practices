
public class HumanBeing {

private int birthyear,age;
private String name;
int thisyear=2022;
private int actualDailyStep=0;
private static int value = 0;



public HumanBeing(String Aleyna , int yas ){ //new consctructor
	this.name= Aleyna;
	this.age =yas;
	value++;
}
		
	
public String tellName()
{
	return name;
	
	
	//returns the name
}


public int tellAge()
{
	int age = thisyear-birthyear;
	
	return age;
	//hocam burda hangi kombinasyonu denersem deneyim yaşı çağıramadım...
	
	//returns the age
}
public int birthYear() {
	return birthyear;
	//returns the birthyear
}


public int step(int actualDStep)
{
	actualDailyStep += actualDStep;
	
	return actualDailyStep;
	
//	 adds the parameter 
	
}
	
	
	public static int getWorldPopulation()
	{
		return value ;
	}
	
	public String toString()//Name : kamil , age:year-1990 ,dailyStep = S
	
	{
		String info = "Name : " + this.name + ", Age : " +this.tellAge() + ", Step : " + this.actualDailyStep;
		return info;
	}
	public int compareTo(Object nesne) {
		HumanBeing a = (HumanBeing) nesne;
		if (this.name.equals(a.name) && this.birthyear==a.birthyear) {
			return 10;
			
		}
		else if (!(this.name.equals(a.name)) && this.age==a.age) {
			return 0;
		
		
		}
		else if (!(this.name.equals(a.name)) && (this.birthyear>a.birthyear) ) {
			return -1;
		}
		else if (!(this.name.equals(a.name))&& (this.age<a.age) ) {
			return 1;}
		
		else return 89;

	}
	
	public String comparePeople(HumanBeing insan){
		String sonuc = " ";
		
		switch (this.compareTo(insan))
		{
		
		case 10 : sonuc= this.name + " and " + insan.name + " are the same persons";
		break;
		
		case 0 : sonuc = this.name + " and " + insan.name + " are the same age ";
		break;
		
		
		case -1 : sonuc = this.name + " is younger than  " + insan.name ;
		break;
		
		case 1 : sonuc = this.name + " is older than " + insan.name ;
		break;
		}
				return sonuc ;
				
		}
	}
	
	
	
	
	
	
	
	


