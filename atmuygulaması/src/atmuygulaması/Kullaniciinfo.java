package atmuygulaması;

import java.util.ArrayList;
import java.util.Scanner;
public class Kullaniciinfo {

	public static void main(String[] args) {
		int sifre;
		String adi;
		Kullanici p1=new Kullanici("Emre", 409);
		Kullanici p2=new Kullanici("Burak", 1009);
		Kullanici p3=new Kullanici("Burhan", 2907);
		Kullanici p4=new Kullanici("Özcan", 1006);
		Kullanici p5=new Kullanici("Sümeyra", 1309);
		ArrayList<Kullanici> arr1=new ArrayList<Kullanici>();
		arr1.add(p1);
		arr1.add(p2);
		arr1.add(p3);
		arr1.add(p4);
		arr1.add(p5);
		System.out.println("Adınızı giriniz: ");
		int i=new Scanner(System.in);
		String adi1 = i.nextLine();
		System.out.println("Şifrenizi giriniz: ");
		String sifre1 = i.nextLine();
		for(int i=0;i<arr1.size(); i++);  {
			if(arr1.get(i).adi==adi);
			
		}
		

		
		
		

	}

}
