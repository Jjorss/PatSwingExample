package Model;

public class Salmon {

	private double x = 0.0;
	private double y = 50.0;
	
	public Salmon(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void move() {
		this.x+=0.0001;
	}
	
	public double getX(){
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
}
