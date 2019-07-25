package esg.itp.shape;

public class Rectangle implements Polygon {

	float length, breadth;
	private float area, peri;

	public Rectangle(int len, int bre) {
		// TODO Auto-generated constructor stub
		this.length = len;
		this.breadth = bre;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area = length * breadth;
	}

	@Override
	public void calcperi() {
		// TODO Auto-generated method stub
		peri = 2 * (length + breadth);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of rectangle is :" + area);
		System.out.println("Perimeter of rectangle is :" + peri);
	}

}
