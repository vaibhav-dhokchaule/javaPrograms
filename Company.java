import java.util.*;
class Employee
{
	int id;
	String name,dept;
    double sal;
	Employee(){}
	Employee(int id,String name,String dept,double sal)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.sal=sal;
	}
	public void accept1() throws Exception
	{
		System.out.println("Enter id,name,dept and sal of employee \t");
		Scanner sc=new Scanner(System.in);
		id=sc.nextInt();
		name=sc.next();
		dept=sc.next();
		sal=sc.nextDouble();
	}
	public void display1()
	{
		System.out.println("Id\tName\tDepartment\tSalary\tBonus\tTotal");
		System.out.print(id+"\t"+name+"\t"+dept+"\t"+sal+"\t");
	}
}
class Manager extends Employee
{
	int bonus;
	public void accept() throws Exception
	{
		accept1();
		System.out.println("Enter bonus \t");
		Scanner sc=new Scanner(System.in);
		bonus=sc.nextInt();
	}
	public void display()
	{
		display1();
		System.out.print(bonus);
	}
}
public class Company {
	public static void main(String[] args) throws Exception {
		int total=0,n;
		System.out.println("Enter no of employee in company\t");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		Manager m[]=new Manager[n];
		for(int i=0;i<n;i++)
		{
			m[i]=new Manager();
			m[i].accept();
		}
		for(int i=0;i<n;i++)
		{
			total=(int)(m[i].sal+m[i].bonus);
		}
		for(int i=0;i<n;i++)
		{
			m[i].display();
			System.out.println("\t"+total);
		}
	}

}
