package odczytZapis;

import java.util.Scanner;

import typSamochodu.*;
public class Odczyt {

public static void ssam(SuperSamochod ssam1) {
	
	Scanner cin=new Scanner(System.in);
	
	
	System.out.print(" marka: ");
	System.out.println(ssam1.getMarka());
	System.out.print("model: ");
	System.out.println(ssam1.getModel());
	System.out.print("pojemność skokowa: ");
	System.out.println(ssam1.getPojSilnika());
	System.out.print("przebieg: ");
	System.out.println(ssam1.getPrzebieg());
	System.out.print("moc: ");
	System.out.println(ssam1.getMoc());
	System.out.print("skrzynia biegów automatyczna: ");
	System.out.println(ssam1.getCzyAutomat());
	System.out.print("od zera do setki w sekundach: ");
	System.out.println(ssam1.getZeroDoSto());
	System.out.print("właściciel: ");
	System.out.println(ssam1.getOwner());
	
}	

public static void suv(Suv suv1) {
	
	Scanner cin=new Scanner(System.in);
	
	
	System.out.print(" marka: ");
	System.out.println(suv1.getMarka());
	System.out.print("model: ");
	System.out.println(suv1.getModel());
	System.out.print("pojemność skokowa: ");
	System.out.println(suv1.getPojSilnika());
	System.out.print("przebieg: ");
	System.out.println(suv1.getPrzebieg());
	System.out.print("moc: ");
	System.out.println(suv1.getMoc());
	System.out.print("skrzynia biegów automatyczna: ");
	System.out.println(suv1.getCzyAutomat());	
	System.out.print("właściciel: ");
	System.out.println(suv1.getOwner());
	
}	

public static void osob(Osobowy osob1) {
	
	Scanner cin=new Scanner(System.in);
	
	
	System.out.println(" marka: ");
	System.out.println(osob1.getMarka());
	System.out.println("model: ");
	System.out.println(osob1.getModel());
	System.out.println("pojemność skokowa: ");
	System.out.println(osob1.getPojSilnika());
	System.out.println("przebieg: ");
	System.out.println(osob1.getPrzebieg());
	System.out.println("moc: ");
	System.out.println(osob1.getMoc());
	System.out.println("skrzynia biegów automatyczna: ");
	System.out.println(osob1.getCzyAutomat());
	System.out.println("właściciel: ");
	System.out.println(osob1.getOwner());
	
}

}
