package odczytZapis;
import typSamochodu.*;


import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;


public class Eksport {
public static void eksport(Osobowy osob1) {
	RandomAccessFile strumien = null;
	 
    try {
    	strumien = new RandomAccessFile("plik.txt", "rw");
    } catch (FileNotFoundException e) {
        System.out.println("Nie znaleziono pliku");
    }

    try {
        
    	strumien.writeUTF("asasa");
    	strumien.writeUTF(osob1.getModel());
    	
    	
    } catch (IOException e) {
        // Obsłużenie wyjątku
    }

    try {
        if (strumien != null)
            strumien.close();
    } catch (IOException e) {
        System.out.println("Błąd zamykania strumienia");
    }
}
}
