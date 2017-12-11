package typSamochodu;

public class Osobowy extends Samochod{
	
	public Osobowy() {}
	public Osobowy(String marka,String model,double pojSilnika, float przebieg,int moc,String czyAutomat, String owner) {
		super(marka,model,pojSilnika,przebieg,moc,czyAutomat,owner);
		owner="";
	}
	
	
	
	
}
