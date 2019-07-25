package esg.itp.shape;

public class Square implements Polygon{

	float side;
	private float area, peri;
	
	public Square(float s) {
		// TODO Auto-generated constructor stub
		this.side = s;
	}
	
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area = side * side;
		
	}

	@Override
	public void calcperi() {
		// TODO Auto-generated method stub
		peri = 4 * side;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Area of square is :" + area);
		System.out.println("Perimeter of square is :" + peri);
	}

}
