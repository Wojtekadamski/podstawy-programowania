package typSamochodu;

public class Suv extends Samochod implements Pojazd{

	private String blokadaDyf;
	private String fwd;
	private int liczbaMiejsc;
	public Suv() {}
	public Suv(String marka,String model,double pojSilnika, float przebieg,int moc,String czyAutomat, String owner) {
		super(marka,model,pojSilnika,przebieg,moc,czyAutomat,owner);
		setBlokadaDyf("");
		setFwd("");
		setLiczbaMiejsc(0);
		owner="";
	}
	
	
	@Override
	public void predkoscMax(int vel) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	public int getLiczbaMiejsc() {
		return liczbaMiejsc;
	}
	public void setLiczbaMiejsc(int liczbaMiejsc) {
		this.liczbaMiejsc = liczbaMiejsc;
	}
	public String getFwd() {
		return fwd;
	}
	public void setFwd(String fwd) {
		this.fwd = fwd;
	}
	public String getBlokadaDyf() {
		return blokadaDyf;
	}
	public void setBlokadaDyf(String blokadaDyf) {
		this.blokadaDyf = blokadaDyf;
	}
}
