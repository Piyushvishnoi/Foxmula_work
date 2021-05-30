package Quadrilateral_shapes;

public class Executing_shapes {
	public static void main(String[] args) {
		Parllelogram p = new Parllelogram(20,20,40,20,20,40,40,40);
		System.out.println("Area of Parallelogram : " + p.area());
		Trapezoid t = new Trapezoid(0, 0, 5, 0, 4, 4, 1, 4);
		System.out.println("Area of Trapezoid : " + t.area());
		Rectangle r = new Rectangle(0,0,5,0,4,4,1,4);
		System.out.println("Area of Rectange : " + r.area());
		Square s = new Square(0, 0, 2, 0, 2 ,2, 0, 2);
		System.out.println("Area of Square : " + s.area());
		
		/*System.out.println("Area of Square : " + s.area());
		System.out.println("Area of Rectange : " + r.area());
		System.out.println("Area of Parallelogram : " + p.area());
		System.out.println("Area of Trapezoid : " + t.area()); */
	}
}
