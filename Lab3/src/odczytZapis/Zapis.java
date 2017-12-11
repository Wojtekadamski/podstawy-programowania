package odczytZapis;
import java.util.Scanner;

import typSamochodu.*;


public class Zapis {
	
	SuperSamochod ssam1= new SuperSamochod();
	Suv suv1= new Suv();		
	Osobowy osob1 = new Osobowy();

	public static void ssam(SuperSamochod ssam1) {
		
		Scanner cin=new Scanner(System.in);
		
		
		System.out.println(" marka: ");
		ssam1.setMarka(cin.nextLine());
		System.out.println("model: ");
		ssam1.setModel(cin.nextLine());
		System.out.println("pojemność skokowa: ");
		ssam1.setPojSilnika(cin.nextDouble());
		System.out.println("przebieg: ");
		ssam1.setPrzebieg(cin.nextFloat());
		System.out.println("moc: ");
		ssam1.setMoc(cin.nextInt());
		System.out.println("od zera do setki w sekundach: ");
		ssam1.setZeroDoSto(cin.nextDouble());
		System.out.println("skrzynia biegów automatyczna: ");
		ssam1.setCzyAutomat(cin.nextLine());
		ssam1.setCzyAutomat(cin.nextLine());
		System.out.println("właściciel: ");
		ssam1.setOwner(cin.nextLine());
		ssam1.setOwner(cin.nextLine());
		
		
	}
	
	public static void suv(Suv suv1) {
		
		Scanner cin1=new Scanner(System.in);
		
		System.out.println(" marka: ");
		suv1.setMarka(cin1.nextLine());
		System.out.println("model: ");
		suv1.setModel(cin1.nextLine());
		System.out.println("pojemność skokowa: ");
		suv1.setPojSilnika(cin1.nextDouble());
		System.out.println("przebieg: ");
		suv1.setPrzebieg(cin1.nextFloat());
		System.out.println("moc: ");
		suv1.setMoc(cin1.nextInt());
		System.out.println("skrzynia biegów automatyczna");
		suv1.setCzyAutomat(cin1.nextLine());
		suv1.setCzyAutomat(cin1.nextLine());
		System.out.println("czy ma napęd na 4 koła");
		suv1.setFwd(cin1.nextLine());
		System.out.println("czy ma blokadę dyf");
		suv1.setBlokadaDyf(cin1.nextLine());
		System.out.println("liczba miejsc: ");
		suv1.setLiczbaMiejsc(cin1.nextInt());
		System.out.println("właściciel: ");
		suv1.setOwner(cin1.nextLine());
		suv1.setOwner(cin1.nextLine());
		
	}
	
	public static void osob(Osobowy osob1) {
	
	Scanner cin2=new Scanner(System.in);
	
	
	System.out.println("marka: ");
	osob1.setMarka(cin2.nextLine());
	System.out.println("model: ");
	osob1.setModel(cin2.nextLine());
	System.out.println("pojemność skokowa: ");
	osob1.setPojSilnika(cin2.nextDouble());
	System.out.println("przebieg: ");
	osob1.setPrzebieg(cin2.nextFloat());
	System.out.println("moc: ");
	osob1.setMoc(cin2.nextInt());
	System.out.println("skrzynia biegów automatyczna");
	osob1.setCzyAutomat(cin2.nextLine());
	osob1.setCzyAutomat(cin2.nextLine());
	System.out.println("właściciel: ");
	osob1.setOwner(cin2.nextLine());
	osob1.setOwner(cin2.nextLine());
	
}
	
}
