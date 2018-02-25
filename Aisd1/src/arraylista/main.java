package arraylista;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Student s = new Student();
		Array tab = new Array();

		tab.wczytaj("plik2.txt");
		tab.wyswietl();
		tab.zmien(732939,4);
		tab.zmien(732,4);
		tab.srednia();
		tab.niezal();
		tab.wyswietl();
		tab.zapisz("plik3.txt");

	}

}
