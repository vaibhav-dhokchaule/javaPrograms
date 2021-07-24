import java.io.*;
class Manager extends Employee
{
private float bonus;
Manager(int id,String name,String department,float salary)
{
super(id,name,department,salary);
}
void accept() throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the bonus:");
bonus=Float.parseFloat(br.readLine());
salary=bonus+salary;
}
public static void sort(Employee a[],int n)
{
String temp;
String temp1;
float temp2;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i].salary<a[j].salary)
{
temp=a[i].name;
a[i].name=a[j].name;
a[j].name=temp;

temp1=a[i].department;
a[i].department=a[j].department;
a[j].department=temp1;

temp2=a[i].salary;
a[i].salary=a[j].salary;
a[j].salary=temp2;
}
}
}
System.out.println("Name==>"+a[0].name);
System.out.println("Department==>"+a[0].department);
System.out.println("Salary==>"+a[0].salary);
}
}

class Emp
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("How many employees:");
int n=Integer.parseInt(br.readLine());
Employee a[]=new Manager[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the ID:");
int id=Integer.parseInt(br.readLine());
System.out.println("Enter the name of employee:");
String name=br.readLine();
System.out.println("Enter department name:");
String department=br.readLine();
System.out.println("Enter the salary:");
float salary=Float.parseFloat(br.readLine());
a[i]=new Manager(id,name,department,salary);
a[i].accept();
a[i].display();
}
System.out.println("After sorting:");
Manager.sort(a,n);
}
}
