
public class Test {
	//inheritance = bir sınıfın başka sınıfın özelliklerini 
	//ve metodlarını miras alma
	
	// is - a ilişkisi ! manager is a employee
	
  public static void main(String[] args) {
	
	Yonetici yonetici1= new Yonetici("mustafa", 2500 , "IT",10);

	yonetici1.bilgilerigoster();

	yonetici1.ZamYap(200);
	
   }


}
