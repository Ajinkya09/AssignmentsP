import esg.itp.shape.*;

public class Calculate {
	public static void main(String[] args) {
		Polygon obj = new Square(10);

		obj.calcArea();
		obj.calcperi();
		obj.display();

		obj = new Rectangle(10, 20);
		obj.calcArea();
		obj.calcperi();
		obj.display();
	}
}
