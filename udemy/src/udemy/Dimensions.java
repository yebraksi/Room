package udemy;

public class Dimensions {
	private double length;
	private double width;
	private double hight;
	public Dimensions (double length, double width, double hight){
		this.length=length;
		this.width= width;
		this.hight=hight;
	}
	private double roomArea(double length, double width, double hight){
		double area= length*width*hight;
		return area;
	}

}
