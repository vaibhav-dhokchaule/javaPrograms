import java.util.*;
abstract class Staff
{
	String name,addr;
	abstract void read();
}
class FullTimeStaff extends Staff
{
	String dept;
	double sal;
	@Override
	void read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name and Address");
		name=sc.next();
		addr=sc.next();
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dept and Salary");
		dept=sc.next();
		sal=sc.nextDouble();	
	}
/*	FullTimeStaff(String dept,double sal)
	{
		this.dept=dept;
		this.sal=sal;
	}*/
	public void show() {
		System.out.println(name+"\t"+addr+"\t"+dept+"\t"+sal);
	}
}
class PartTimeStaff extends Staff
{
	int noh,rph;
	@Override
	void read() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name and Address");
		name=sc.next();
		addr=sc.next();	
	}
	void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter NoOfHours and RatePerHours");
		noh=sc.nextInt();
		rph=sc.nextInt();	
	}
/*	PartTimeStaff(int noh,int rph)
	{
		this.noh=noh;
		this.rph=rph;
	}*/
	public void show() {
		System.out.println(name+"\t"+addr+"\t"+noh+"\t"+rph+"\t"+(noh*rph));
	}
}
public class AbstractStaff {

	public static void main(String[] args) {
		int n;
		String staff;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of Staff");
		n=sc.nextInt();
		FullTimeStaff fs[]=new FullTimeStaff[n];
		PartTimeStaff ps[]=new PartTimeStaff[n];
		for(int i=0;i<n;i++)
		{
			fs[i]=new FullTimeStaff();
			ps[i]=new PartTimeStaff();
//			fs[i]=new FullTimeStaff("Computer",50000);
//			ps[i]=new PartTimeStaff(6,500);
		}
		System.out.println("Enter the Staff type");
		staff=sc.next();
		if(staff.equalsIgnoreCase("FullTimeStaff"))
		{
			for(int i=0;i<n;i++)
			{
			fs[i].read();
			fs[i].accept();
			}
			System.out.println("Name\tAddress\tDept\tSalary");
			for(int i=0;i<n;i++)
				fs[i].show();
		}
		else
		{
			for(int i=0;i<n;i++)
			{
			ps[i].read();
			ps[i].accept();
			}
			System.out.println("Name\tAddress\tNoh\tRph\tAmount");
			for(int i=0;i<n;i++)
				ps[i].show();
		}
	}

}