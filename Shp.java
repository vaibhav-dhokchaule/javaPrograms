import java.util.Scanner;
abstract class Shape
{
public float radius,hight,length,breadth;
abstract void accept(); 
abstract void calc_area();
abstract void calc_volume();
}

class Sphere extends Shape
{
void accept()// throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of sphere:");
radius=sc.nextFloat();
}
void calc_area()
{
float area=4*3.14f*radius*radius;
System.out.println("Area of sphere:"+area);
}
void calc_volume()
{
float volume=(4/3)*3.14f*radius*radius*radius;
System.out.println("Volume of sphere:"+volume);
}
}

class Cone extends Shape
{
void accept()// throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of sphere:");
radius=sc.nextFloat();
System.out.println("Enter the hight:");
hight=sc.nextFloat();
}
void calc_area()
{
float area=(4/3)*3.14f*radius*radius*hight;
System.out.println("Area of cone:"+area);
}
void calc_volume()
{
float volume=(3.14f*radius*radius*hight)/3;
System.out.println("Volume of cone:"+volume);
}
}

class Cylinder extends Shape
{
void accept()// throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of cylinder:");
radius=sc.nextFloat();
System.out.println("Enter the hight of cylinder:");
hight=sc.nextFloat();
}
void calc_area()
{
float area=2*3.14f*radius*(1+radius);
System.out.println("Area of cylinder:"+area);
}
void calc_volume()
{
float volume=3.14f*radius*radius*hight;
System.out.println("Volume of cylinder:"+volume);
}
}

class Box extends Shape
{
void accept()// throws IOException
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the length of box:");
length=sc.nextFloat();
System.out.println("Enter the breadth of box:");
breadth=sc.nextFloat();
System.out.println("Enter the hight of Box:");
hight=sc.nextFloat();
}
void calc_area()
{
float area=length*breadth*hight;
System.out.println("Area of box:"+area);
}
void calc_volume()
{
float volume=2*(length*breadth)+(length*hight)+(breadth*hight);
System.out.println("Volume of box:"+volume);
}
}

class Shp
{
public static void main(String args[])
{
Shape s=new Sphere();
s.accept();
s.calc_area();
s.calc_volume();
Shape c=new Cone();
c.accept();
c.calc_area();
c.calc_volume();
Shape cc=new Cylinder();
cc.accept();
cc.calc_area();
cc.calc_volume();
Shape b=new Box();
b.accept();
b.calc_area();
b.calc_volume();
}
}
