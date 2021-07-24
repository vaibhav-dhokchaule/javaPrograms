import java.io.*;
class Vehcl
{ 
 String company;
 double price;
 public void accept() throws IOException
{
  System.out.println("Enter the Company and price of the Vehicle: ");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  company=br.readLine();
  price=Double.parseDouble(br.readLine());
  
}
 public void display()
{
  System.out.println("Company: "+company+" Price: "+price);
}
 
}
class LightMotorVehicle extends Vehcl
{
 double mileage;
 public void accept() throws IOException
{
  super.accept();
  System.out.println("Enter the mileage of the vehicle: ");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  mileage=Double.parseDouble(br.readLine());
}
 public void display()
{
  super.display();
  System.out.println("Mileage: "+mileage);
}
}
class HeavyMotorVehicle extends Vehcl
{
 double captons;
 public void accept() throws IOException
{
  super.accept();
  System.out.println("Enter the capacity of vehicle in tons: ");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  captons=Double.parseDouble(br.readLine());
}
 public void display()
{
  super.display();
  System.out.println("Capacity in tons: "+captons);
}
}

class Vehicle
 {
 public static void main(String [] args) throws IOException{
  int i;
  System.out.println("Enter the type of vehicle: ");
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("1.Light Vehicle");
  System.out.println("2.Heavy Vehicle");
  int ch=Integer.parseInt(br.readLine());
  switch(ch){
  case 1: 
   System.out.println("Enter the number of Light vehicles: ");
   int n=Integer.parseInt(br.readLine());
   LightMotorVehicle [] l=new LightMotorVehicle[n];
   for(i=0;i<n;i++){
    l[i]=new LightMotorVehicle();
    l[i].accept();
   }
   for(i=0;i<n;i++){
    l[i].display();
   }
   break;
  case 2:
   System.out.println("Enter the number of Heavy vehicles: ");
   int m=Integer.parseInt(br.readLine());
   HeavyMotorVehicle [] h=new HeavyMotorVehicle[m];
   for(i=0;i<m;i++){
     h[i]=new HeavyMotorVehicle();
     h[i].accept(); 
    }
   for(i=0;i<m;i++){
    h[i].display();
   }
   break; 
   } 
  } 

}
