import java.util.Scanner;
public class S�n�f�Ge�meDurumu {

	public static void main(String[] args) {
		int mat,fizik,turkce,kimya,muzik;
		Scanner keyboard= new Scanner (System.in);
		System.out.println("Matematik notunuz : ");
		mat=keyboard.nextInt();
		System.out.println("Fizik notunuz : ");
		fizik=keyboard.nextInt();
		System.out.println("T�rk�e notunuz : ");
		turkce=keyboard.nextInt();
		System.out.println("Kimya notunuz : ");
		kimya=keyboard.nextInt();
		System.out.println("M�zik notunuz : ");
		muzik=keyboard.nextInt();
		double toplam=0;
		double ort ;
		int derssayac=0;
		
		if (0<mat&& mat<100) {
			toplam+=mat;
	        derssayac+=1;
		
		}
	else {
		System.out.println("Matematik notunuz ortalamaya dahil edilmedi.");
	}
		
		 if (0<fizik&& fizik<100) {
				toplam+=fizik;
		        derssayac+=1;
			}
		 
		else {
			System.out.println("Fizik notunuz ortalamaya dahil edilmedi.");
		}
			 
			 
			 
			 if (0<turkce&& turkce<100) {
					toplam+=turkce;
			        derssayac+=1;
				 }
			 
			else {
				System.out.println("T�rk�e notunuz ortalamaya dahil edilmedi.");
				}
			
				 
				 
				 if (0<kimya&& kimya<100) {
						toplam+=kimya;
				        derssayac+=1;
					}
				else {
					System.out.println("Kimya notunuz ortalamaya dahil edilmedi.");
				}
				
					 
					 
					 if (0<muzik&& muzik<100) {
							toplam+=muzik;
					        derssayac+=1;
						}
					else {
						System.out.println("M�zik notunuz ortalamaya dahil edilmedi.");
					}
					
					 
		 ort=toplam/derssayac;
		
		if (ort<=55) {
			System.out.println("S�n�fta kald�n�z,seneye tekrar g�r��mek �zere!");
		}
		else {
		System.out.println("Tebrikler,s�n�f� ge�tiniz!");
		}
		
		System.out.println("Ortalaman�z : "+ort);
	}

}
