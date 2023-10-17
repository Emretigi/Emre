package b;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int num1;
		int num2;
		System.out.println("bir sayı giriniz");
		num1=input.nextInt();
		int birler,onlar,yüzler,binler,onbinler;
		birler=num1%10;
		onlar=(num1%100)/10;
		yüzler=(num1%1000)/100;
		binler=(num1%10000)/1000;
		onbinler=(num1%100000)/1000;
		System.out.println("birler "+birler);
		System.out.println("onlar "+onlar);
		System.out.println("yüzler "+yüzler);
		System.out.println("binler "+binler);
		System.out.println("onbinler "+onbinler);
		
		System.out.println("bir sayı giriniz");
	    num1=input.nextInt();
	    num2=input.nextInt();
	    System.out.println(num1 + num2);
	    System.out.println(num1 - num2);
	    System.out.println(num1 * num2);
	    System.out.println(num1 / num2);
	    
	    double yaricap,alan,pi=3.14;
	    System.out.println("yaricapi giriniz");
	    yaricap=input.nextDouble();
	    alan=pi*(yaricap*yaricap);
	    System.out.println("alan "+alan);
	
	    float boy;
	    float ağırlık;
	    float endex;
	    System.out.println("boy giriniz");
	    System.out.println("ağırlık giriniz");
	    boy=input.nextInt();
	    ağırlık=input.nextInt();
	    System.out.println("boy "+boy);
	    System.out.println("ağırlık "+ağırlık);
	    endex= 10000 * (ağırlık / (boy * boy));
	    System.out.println("endex "+endex);
	    if (endex<18.5);
	    System.out.println("zayıf");
	    if (endex>18.5);
	    while (endex<24.9);
	    System.out.println("normal");
	    if (endex>24.9);
	    while (endex<29.9);
	    System.out.println("şişman");
	    if (endex>30);
	    System.out.println("obez");
	    
	    
	    
	    
	    
	    
	    
	 
	  
	    

	}

}
