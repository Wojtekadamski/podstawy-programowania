package typSamochodu;

public class SuperSamochod extends Samochod implements Pojazd{
	
	private double zeroDoSto;
	private String rwd;
	private String aws;
	public SuperSamochod() {}
	public SuperSamochod(String marka,String model,double pojSilnika, float przebieg,int moc,String czyAutomat, String owner) {
		super(marka,model,pojSilnika,przebieg,moc,czyAutomat,owner);
		setZeroDoSto(0);
		setRwd("");
		setAws("");
		
	}
	
	
	
	@Override
	public void predkoscMax(int vel) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	public String getAws() {
		return aws;
	}
	public void setAws(String aws) {
		this.aws = aws;
	}
	public String getRwd() {
		return rwd;
	}
	public void setRwd(String rwd) {
		this.rwd = rwd;
	}
	public double getZeroDoSto() {
		return zeroDoSto;
	}
	public void setZeroDoSto(double zeroDoSto) {
		this.zeroDoSto = zeroDoSto;
	}
	
	
}
