import java.util.*;
class Vehicle
{
	String cname;
	double price;
	void read()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Companyname and Price");
	cname=sc.next();
	price=sc.nextDouble();
	}
	void show()
	{
		System.out.print(" "+cname+"\t"+price);
	}
}
class LightMotorVehicle extends Vehicle
{
	double m;
	void accept()
	{
		read();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mileage");
		m=sc.nextDouble();	
	}
	void disp()
	{
		show();
		System.out.print("\t"+m);
		System.out.println("");
	}
}
class HeavyMotorVehicle extends Vehicle
{
	double cit;
	void accept()
	{
		read();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Capacity in tons");
		cit=sc.nextDouble();	
	}
	void disp()
	{
		show();
		System.out.print("\t"+cit);
		System.out.println("");
	}
}
public class Motor {
	public static void main(String[] args) {
		int n;
		String type;
		System.out.println("Enter no of Vehicle");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		LightMotorVehicle lv[]=new LightMotorVehicle[n];
		HeavyMotorVehicle hv[]=new HeavyMotorVehicle[n];
		for(int i=0;i<n;i++)
		{
			lv[i]=new LightMotorVehicle();
			hv[i]=new HeavyMotorVehicle();
		}
		System.out.println("Enter the type of vehicle");
		type=sc.next();
		if(type.equalsIgnoreCase("LightVehicle"))
		{
			for(int i=0;i<n;i++)
				lv[i].accept();
			System.out.println("Company\tPrice\tMileage");
			for(int i=0;i<n;i++)
				lv[i].disp();
		}
		else
		{
			for(int i=0;i<n;i++)
				hv[i].accept();
			System.out.println("Company\tPrice\tCapacity");
			for(int i=0;i<n;i++)
				hv[i].disp();
		}
	}
}