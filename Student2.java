import java.io.*;
class Student2
{
int roll;
String name;
double perc;
public void accept() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Rollno:");
roll=Integer.parseInt(br.readLine());
System.out.println("Enter Name:");
name=br.readLine();
System.out.println("\nEnter Percentage:");
perc=Double.parseDouble(br.readLine());
}
public static void sort(Student2 s[],int n) 
{
int temp1;
String temp2;
double temp3;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(s[i].perc<s[j].perc)
{
temp1=s[i].roll;
s[i].roll=s[j].roll;
s[j].roll=temp1;
temp2=s[i].name;
s[i].name=s[j].name;
s[j].name=temp2;
temp3=s[i].perc;
s[i].perc=s[j].perc;
s[j].perc=temp3;
}
}
}
for(int i=0;i<n;i++)
{
System.out.println("Rollno="+s[i].roll);
System.out.println("Name="+s[i].name);
System.out.println("Percentage="+s[i].perc);
}
}

public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("How many students:");
int n=Integer.parseInt(br.readLine());
Student2 s[]=new Student2[n];
for(int i=0;i<n;i++)
{
s[i]=new Student2();
s[i].accept();
}
for(int i=0;i<n;i++)
{
System.out.println("Rollno="+s[i].roll);
System.out.println("Name ="+s[i].name);
System.out.println("Percentage="+s[i].perc);
}
System.out.println("After Sorting:");
Student2.sort(s,n);
}
}
