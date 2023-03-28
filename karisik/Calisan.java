
public class Calisan  {
 // ana class = super class  veya base class
	
	private String isim; //privatesa başka bir classtan direkt olarak erişilemez
	private int maas;
	private String departman;
	
	public Calisan(String isim, int maas, String departman) {
		this.isim = isim;
		this.maas = maas;
		this.departman = departman;
	}
	
	public void calis () {
		System.out.println("calisan calisiyor.");
	}
	
	
	public void bilgilerigoster () {
		
		System.out.println("isim:" + isim);
		System.out.println("maas:" + maas);
		System.out.println("departman:" + departman);
	}
	
	public void departmanDegistir (String yeni_departman) {
		System.out.println("departman degiştiriliyor.");
		this.departman = yeni_departman;
		System.out.println("yeni departman:" + this.departman);
	}
	

public String getİsim () {
	return this.isim;
}
public int getMaas() {
	return this.maas;
}
public void setMaas(int maas) {
	this.maas = maas;
}
}