import java.io.*;
class Filestr
{
public static void main(String args[])
{
int i=0;
String dirname=args[0];
File f=new File(dirname);
if(f.isDirectory())
{
System.out.println("Is a directory");
String s[]=f.list();
while(i<s.length)
{
i++;
}
System.out.println("Total no of files :"+i);
}
else
{
System.out.println("Is a file");
String name=f.getAbsolutePath();
System.out.println("Path of file is:"+name);
long l=f.length();
System.out.println("length of the file:"+l);
}
}
}
