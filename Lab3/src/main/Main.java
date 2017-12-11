package main;
import java.util.*;

import odczytZapis.*;
import typSamochodu.*;
public class Main {
	
	

	public static void main(String[] args) {
		Scanner we= new Scanner(System.in);
		SuperSamochod ssam1= new SuperSamochod();
		Suv suv1= new Suv();		
		Osobowy osob2 = new Osobowy();
		SuperSamochod ssam2= new SuperSamochod();
		Suv suv2= new Suv();		
		Osobowy osob1 = new Osobowy();
		
		
		
	/*	System.out.println("porównanie dwóch samochodów: ");
		System.out.println("jakie samochody chcesz porównać?(0-Super samochody, 1-SUVy, 2-osobowe, 3-żadne");
		byte var= we.nextByte();
		switch(var){
		case 0:
			Zapis.ssam(ssam1);
			Zapis.ssam(ssam2);
			break;
		case 1:
			Zapis.suv(suv1);
			Zapis.suv(suv2);
			break;
		case 2:
			Zapis.osob(osob1);
			Zapis.osob(osob2);
			break;
		default:
			break;
		}*/
		//System.out.println("wprowadź trzy samochody:\n Super Samochód:");
		//Zapis.suv(suv1);
		//System.out.println("SUV:");
		//Zapis.suv(suv1);
		////System.out.println("osobowy:");
		Zapis.osob(osob1);
		//System.out.println("czy pobrać dane?");
		//Odczyt.suv(suv1);
		//Odczyt.suv(suv1);
		//Odczyt.osob(osob1);
		
		Eksport.eksport(osob1);
		
		
	}

	

	


	



}
