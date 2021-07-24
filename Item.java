import java.io.*;
import java.util.*;

class Item1
{
 
 String name,id;
 int qty;
 double price,total;
 Item1(String i,String n,String q,String p)
 {
  name=n;
  id=i;
  qty=Integer.parseInt(q);
  price=Double.parseDouble(p);
  total=qty*price;
 }
 public String toString()
 {
  String s=name+" "+id+" "+qty+" "+price+" "+total;
  return(s);
 } 
 public static void search(Item1[] arr,int n)throws IOException
 {
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String s=br.readLine();
  for(int i=0;i<n;i++)
  {
   if(arr[i].name.equals(s))
   {
    System.out.println(arr[i].toString());
    return;
   }
  }
  System.out.println("No Records Found"); 
 }
 public static void searchc(Item1[] arr,int n)
 {
  double max=0;int c=0;  
        for(int i=0;i<n;i++)
        {
         if(arr[i].price > max)
         {
          c=i;
         }
  }
  System.out.println(arr[c].toString());
 }
}
class Item
{
 public static void main(String[] args)throws IOException
 {
  String s,space=" ";
        int q,i;
  BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter no. of records");
  int n=Integer.parseInt(b.readLine());
  System.out.println("Enter Records:\n<id> <name> <price> <qty> :");
  FileWriter f=new FileWriter("item.txt");
  for(i=0;i<n;i++)
  {
   s=b.readLine()+"\n";
   f.write(s); 
  }
  f.close();
  Item1 it[]=new Item1[20];
  FileReader fr=new FileReader("item.txt");
  BufferedReader br=new BufferedReader(fr);
  for(i=0;i<n;i++)
  {
   s=br.readLine();
   StringTokenizer t=new StringTokenizer(s,space);
            String si=new String(t.nextToken());
            String sn=new String(t.nextToken());
            String sq=new String(t.nextToken());
            String sp=new String(t.nextToken());
   it[i]=new Item1(si,sn,sq,sp);
  }
  do
  {
System.out.println("Menu :\n"+"1:Search the Item\n"+"2:Cost of Item");
System.out.println("3:Total Cost\n4:Exit\n"+"Choice :" );
q=Integer.parseInt(b.readLine());
   switch (q)
   {
    case 1:
      System.out.println("Enter item name to be searched:");
      Item1.search(it,n); break;
    case 2:
      System.out.println("Cost list Item :");
      Item1.searchc(it,n);
      break;
    case 3:
      for(i=0;i<n;i++)
         System.out.println(it[i].toString()); 
        break;
    case 4:
      break;
          default:
            System.out.println("Invalid Option");
   }
  }while(q!=4);
 }
}
