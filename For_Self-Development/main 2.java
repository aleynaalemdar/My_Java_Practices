class HHayvan{
	private String isim;
	public HHayvan(String isim) {
		this.isim = isim;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String konus (){
		return "hayvan konuşuyor.";
	}
	
	
}

class Kedi extends HHayvan{
	
	public Kedi(String isim) {
		super(isim);
	}
	//polymoprhisime uyması için konus metodunu override etmeliyim
	
	public String konus() {
		return this.getIsim()+"miyavlıyor.";
		
	}
	
}

class KKopek extends HHayvan {
	public KKopek(String isim) {
		super(isim);
	}
	
	public String konus() {
		return this.getIsim()+"havlıyor.";
	}
}

class At extends HHayvan{
	public At (String isim) {
		super(isim);
	}
	public String konus() {
		return this.getIsim()+"kişniyor.";
	}
}


public class main {
	
	
	
	//instanceof objesi!!!!!
	public static void konustur(HHayvan hayvan) {
		System.out.println(hayvan.konus());
	}
	
// çok biçimlilik polymorphism
//bir nesnenin birden farklı nesne gibi davranması...
	public static void main(String[] args) {
		
		KKopek kopek = new KKopek("Karabas");
		if (kopek instanceof HHayvan) {
			System.out.println("Bu nesne köpek sınıfından..");
		}
		
		//köpek de bir hayvan.....
		
		
		
		
		
		
		
	//HHayvan hayvan = new HHayvan("limon");
	//output = hayvan konuşuyor.
  /* HHayvan hayvan1 = new Kedi("Tekir");
   
    System.out.println(hayvan1.konus());
	//output=hayvan konuşuyor.

    //
	HHayvan hayvan2 = new KKopek("Karabas");
	System.out.println(hayvan2.konus());
	//output=
	/*Tekirmiyavlıyor.
      Karabashavlıyor.

	 * 
	 */
	
/*	HHayvan hayvan3= new At("Şahbatur");
	System.out.println(hayvan3.konus());*/
		
		
		
		/*konustur(new Kedi("Tekir"));
		konustur(new KKopek("karabas"));
		konustur(new At("sahbatur"));
		konustur(new HHayvan("aaa"));*/
		/*
		 * 
		 * output=
		 * Tekirmiyavlıyor.
          karabashavlıyor.
           sahbaturkişniyor.
            hayvan konuşuyor.

		 */
    
	}
//alttaki classlarda override edilmemişse kendininkini kullanıyor.
}
//birden fazla classı buraya yazabilirim,classların başşına public koyma
