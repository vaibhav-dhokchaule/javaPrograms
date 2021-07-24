import java.util.*;
abstract class Shape1
{
	abstract void read();
    abstract void calc_area();
	abstract void calc_volume();
}
class Sphere extends Shape1
{
	double r;
	@Override
	void read() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius");
		r=sc.nextDouble();
	}
	@Override
	void calc_area() {
		double area=4*3.14*r*r;
		System.out.println("Area of Sphere is:"+area);
	}

	@Override
	void calc_volume() {
		double vol=(4/3)*3.14*r*r*r;
		System.out.println("Volume of Sphere is:"+vol);
		}
}
class Cone extends Shape1
{
	double r,h;
	@Override
	void read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius and Height");
		r=sc.nextDouble();
		h=sc.nextDouble();
	}
	@Override
	void calc_area() {
		double area=(4/3)*3.14*r*r*h;
		System.out.println("Area of Cone is:"+area);
			}
	@Override
	void calc_volume() {
		double vol=3.14*(r*r*h)/3;
		System.out.println("volume of Cone is:"+vol);
	}
}
class Cylinder1 extends Shape1{
	double r,h;
	@Override
	void read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Radius and Height");
		r=sc.nextDouble();
		h=sc.nextDouble();
	}
	@Override
	void calc_area() {
		double area=2*3.14*r*(1+r);
		System.out.println("Area of Cylinder is:"+area);
	}
	@Override
	void calc_volume() {
		double vol=3.14*r*r*h;
		System.out.println("volume of Cylinder is:"+vol);		
	}
}
class Box extends Shape1{
	double l,b,h;
	@Override
	void read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Lenght,Breadth and Height");
		l=sc.nextDouble();
		b=sc.nextDouble();
		h=sc.nextDouble();
	}
	@Override
	void calc_area() {
		double area=l*b*h;
		System.out.println("Area of Cylinder is:"+area);
	}
	@Override
	void calc_volume() {
		double vol=2*(l*b+l*h+b*h);
		System.out.println("volume of Cylinder is:"+vol);		
	}
}

public class CalArea {
	public static void main(String[] args) {
		Sphere sp=new Sphere();
		Cone cn=new Cone();
		Cylinder1 cr=new Cylinder1();
		Box b1=new Box();
		sp.read();
		sp.calc_area();
		sp.calc_volume();
		cn.read();
		cn.calc_area();
		cn.calc_volume();
		cr.read();
		cr.calc_area();
		cr.calc_volume();
		b1.read();
		b1.calc_area();
		b1.calc_volume();
	}

}
