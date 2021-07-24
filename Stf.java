import java.util.scanner;

class FullTimeStaff extends Staff
{
String department;
float salary;
FullTimeStaff(String name,String address,String department,float salary)
{
super(name,address);
this.department=department;
this.salary=salary;
}
void display()
{
System.out.println("Member name=>"+name);
System.out.println("Address=>"+address);
System.out.println("Department=>"+department);
system.out.println("Salary=>"+salary);
}
}

class PartTimeStaff extends Staff
{
int hr,rate;
PartTimeStaff(String name,String address,int hr,int rate)
{
super(name,address);
this.hr=hr;
this.rate=rate;
}
void display()
{
System.out.println("Member name=>"+name);
System.out.println("Address=>"+address);
System.out.println("Number of hour=>"+hr);
system.out.println("Rate=>"+rate);
}
}

class Stf
{
public static void main(String args[]) throws Exception
{
String name,address,department;
float salary;
int hr,rate;
Scanner sc=new Scanner(System.in);
System.out.println("How many workers:");
Staff a[]=new Staff[n];
System.out.println("Enter your choise:");
System.out.print("1:FullTimeStaff\n2:partTimeStaff\n");
int op=sc.nextInt();
switch(op)
{
case 1:for(int i=0;i<n;i++)
{
System.out.println("Enter the member name:");
name=sc.nextLine();
System.out.println("Enter the address:");
address=sc.nextLine();
Sytem.out.println("Enter the department:");
department=sc.nextLine();
System.out.println("Enter the salary");
salary=sc.nextFloat();
a[i]=new FullTimeStaff(name,address,hr,rate);
a[i].display();
}
break;
case 2:for(int i=0;i<n;i++)
{
System.out.println("Enter the member name:");
name=sc.nextLine();
System.out.println("Enter the address:");
address=sc.nextLine();
Sytem.out.println("Enter the no of hours:");
hr=sc.nextInt();
System.out.println("Enter the rate");
rate=sc.nextInt();
a[i]=new PartTimeStaff(name,address,hr,rate);
a[i].display();
}
break;
}
}
}
