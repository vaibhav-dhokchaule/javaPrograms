interface Shape {
double area();
}
class Circle implements Shape
{
	double PI=3.14;
	double r;
	Circle(double r)
	{
		this.r=r;
	}
	public double area()
	{
		return PI*r*r;
	}
}
class Cylinder extends Circle
{
	double h;
	Cylinder(double r,double h)
	{
		super(r);
		this.h=h;
	}
	public double area()
	{
		return PI*r*r*h;
		
	}
}
public class Test {

	public static void main(String[] args) {
		Shape s;
		s=new Circle(2.3);
		System.out.println("Area of circle is:"+s.area());
		s=new Cylinder(2,2.2);
		System.out.println("Area of cylinder is:"+s.area());
	}

}
