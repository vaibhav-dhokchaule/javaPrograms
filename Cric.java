import java.io.*;
class CricketPlayer
{
String name;
int no_of_innings,no_times_notout,total_runs;
float bat_avg;
CricketPlayer(String name,int ninnings,int notout,int runs,float avg)
{
this.name=name;
no_of_innings=ninnings;
no_times_notout=notout;
total_runs=runs;
bat_avg=avg;
}
void display()
{
System.out.println("Name :"+name);
System.out.println("No of Innigs:"+no_of_innings);
System.out.println("No of times not out:"+no_times_notout);
System.out.println("Total Runs:"+total_runs);
System.out.println("Total Runs:"+bat_avg);
}
public static void sortplayer(CricketPlayer c[],int n)
{
int truns=0;
String temp;
int temp1,temp2,temp3;
float temp4;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
temp=c[i].name;
c[i].name=c[j].name;
c[j].name=temp;

temp1=c[i].no_of_innings;
c[i].no_of_innings=c[j].no_of_innings;
c[j].no_of_innings=temp1;

temp2=c[i].no_times_notout;
c[i].no_times_notout=c[j].no_times_notout;
c[j].no_times_notout=temp2;

temp3=c[i].total_runs;
c[i].total_runs=c[j].total_runs;
c[j].total_runs=temp3;

temp4=c[i].bat_avg;
c[i].bat_avg=c[j].bat_avg;
c[j].bat_avg=temp4;
}
}
System.out.println("After sorting:");
for(int i=0;i<n;i++)
{
System.out.println("Name :"+c[i].name);
System.out.println("No of Innigs:"+c[i].no_of_innings);
System.out.println("No of times not out:"+c[i].no_times_notout);
System.out.println("Total Runs:"+c[i].total_runs);
System.out.println("Batting average"+c[i].bat_avg);
}
}
}

class Cric
{
public static void main(String args[])
{
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
System.out.println("Enter the no of players:");
String name;
int ninnings,notout,runs;
float avg;
try
{
int n=Integer.parseInt(br.readLine());
CricketPlayer c[]=new CricketPlayer[n];
System.out.println("Enter the information:");
for(int i=0;i<n;i++)
{
System.out.println("Enter the name of "+(i+1)+" player");
name=br.readLine();
System.out.println("Enter the no of innigs played");
ninnings=Integer.parseInt(br.readLine());
System.out.println("Enter the no of time player not out");
notout=Integer.parseInt(br.readLine());
System.out.println("Total Runs");
runs=Integer.parseInt(br.readLine());
System.out.println("Enter the average");
avg=runs/ninnings;
c[i]=new CricketPlayer(name,ninnings,notout,runs,avg);
c[i].display();
}
CricketPlayer.sortplayer(c,n);
}

catch(Exception e)
{
System.out.println("Exception occured");
}
}
}
