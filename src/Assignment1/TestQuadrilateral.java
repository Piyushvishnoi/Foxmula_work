package Assignment1;
 
class Quadrilateral
{
	protected double x1,x2,x3,x4,y1,y2,y3,y4;
	protected void setCoordinate(int a, int b, int c, int d, int e, int f, int g, int h)
	{
		x1=a;
		y1=b;
		x2=c;
		y2=d;
		x3=e;
		y3=f;
		x4=g;
		y4=h;
	}
}

class Squre extends Quadrilateral
{
	Squre(int a, int b, int c, int d, int e, int f, int g, int h)
	{
		setCoordinate(a,b,c,d,e,f,g,h);
	}
	int area()
	{
		int d= (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return d*d;
	}
}

class Rectangle extends Quadrilateral
{
	Rectangle(int a, int b, int c, int d, int e, int f, int g, int h)
	{
		setCoordinate(a,b,c,d,e,f,g,h);
	}
	int area()
	{
		int d1= (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2= (int)Math.sqrt((x1-x4)*(x1-x4)+(y1-y4)*(y1-y4));
		return d1*d2;
	}
}

class Trapezoid extends Quadrilateral
{
	private int height;
	Trapezoid(int a, int b, int c, int d, int e, int f, int g, int h, int height)
	{
		setCoordinate(a,b,c,d,e,f,g,h);
		this.height = height;
	}
	int area()
	{
		int d1= (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		int d2= (int)Math.sqrt((x3-x4)*(x3-x4)+(y3-y4)*(y3-y4));
		return (int)((d1+d2)*height)/2;
	}
}

class Parallelogram extends Quadrilateral
{
	private int height;
	Parallelogram(int a, int b, int c, int d, int e, int f, int g, int h, int height)
	{
		setCoordinate(a,b,c,d,e,f,g,h);
		this.height = height;
	}
	int area()
	{
		int d1= (int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		return (int)d1*height;
	}
}

class TestQuadrilateral
{
	public static void main(String []args)
	{
		Squre sq=new Squre(20,20,40,20,40,40,20,40);
		System.out.println("Area of the squre is "+sq.area());
		
		Rectangle rec=new Rectangle(20,20,40,20,40,40,20,40);
		System.out.println("Area of the rectangle is "+rec.area());
		
		Trapezoid tp=new Trapezoid(20,20,40,20,40,40,20,40,8);
		System.out.println("Area of the trapezoid is "+tp.area());
		
		Parallelogram pg=new Parallelogram(20,20,40,20,40,40,20,40,8);
		System.out.println("Area of the parallelogram is "+pg.area());
	}
}
