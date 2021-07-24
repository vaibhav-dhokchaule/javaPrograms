import java.io.*;
public class Employee
{
private int id;
public String name,department;
public float salary;
Employee(){}
Employee(int id,String name,String department,float salary)
{
this.id=id;
this.name=name;
this.department=department;
this.salary=salary;
}
void accept() throws IOException
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

}
void display()
{
System.out.println("id==>"+id);
System.out.println("Name==>"+name);
System.out.println("Department==>"+department);
System.out.println("Salary==>"+salary);
}
}
