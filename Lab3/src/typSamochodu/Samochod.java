package typSamochodu;

public abstract class Samochod {
	// Konstruktory, gettery i settery
	private double pojSilnika;
	private float przebieg;
	private int moc;
	private String czyAutomat;
	private String marka;
	private String model;
	private String owner;
	private int maxSpeed;
	
	public Samochod() {
		setPojSilnika(0);
		setPrzebieg(0);
		setMoc(0);
		setCzyAutomat("");
		setMarka("");
		setModel("");
	}
	public Samochod(String marka, String model, double pojSilnika, float przebieg, int moc, String czyAutomat, String owner ) {
		this.setMarka(marka);
		this.setModel(model);
		this.setPojSilnika(pojSilnika);
		this.setPrzebieg(przebieg);
		this.setMoc(moc);
		this.setCzyAutomat(czyAutomat);
		this.setOwner(owner);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getCzyAutomat() {
		return czyAutomat;
	}
	public void setCzyAutomat(String czyAutomat) {
		this.czyAutomat = czyAutomat;
	}
	public int getMoc() {
		return moc;
	}
	public void setMoc(int moc) {
		this.moc = moc;
	}
	public float getPrzebieg() {
		return przebieg;
	}
	public void setPrzebieg(float przebieg) {
		this.przebieg = przebieg;
	}
	public double getPojSilnika() {
		return pojSilnika;
	}
	public void setPojSilnika(double pojSilnika) {
		this.pojSilnika = pojSilnika;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner=owner;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	//Metody
	
}


