
public class Yonetici extends Calisan{
// subclass ( altsınıf )
	
	//calisan classının özelliklerini ve metodlarını almak istiyorum
	
	//constructorını tanımla yöneticiye özgü!!!!
	
	
	 private int sorumlu_kisi ;
	 
	 
	 
	public Yonetici(String isim , int maas , String departman,int sorumlu_kisi) {
		
		/*this.isim = isim;
		this.maas = maas;
		this.departman = departman;*/
	//this(); // classın constructorını kullanmak için
		
	  super(isim, maas, departman); //miras aldığım constructorı kullanmak istiyorum
	  //constructor için..........
		this.sorumlu_kisi=sorumlu_kisi;
		
		
	}
	 //OVERRIDING 
public void bilgilerigoster () {
		
		super.bilgilerigoster(); 
		//super classımdaki bilgilerigöster metodumu kullanmak istiyorum...
	
		System.out.println("sorumlu kisi"+ sorumlu_kisi);
	} 
//eğer değiştirirsem aynı isimle metodu bu çağrılır
	
	
	public void ZamYap (int zam_miktarı) {
		System.out.println("calisanlara" + zam_miktarı + "yapildi"); 
		int yeni_maas = getMaas()+ zam_miktarı;
		System.out.println("yeni maas=" + yeni_maas);
	}
	
	
}
