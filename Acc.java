import java.io.*;
class Account
{
String name;
int acc_no;
float balance;
Account(int acc_no,String name,float balance)
{
this.acc_no=acc_no;
this.name=name;
this.balance=balance;
}
void withdraw(int amt)
{
balance=balance-amt;
while(balance<500)
{
System.out.println("Please enter lesser amout");
balance=balance+amt;
//break;
}
}

void deposite(int dep)
{
balance=balance+dep;
System.out.println("Balance:"+balance);
}

void viewbalance()
{
System.out.println("Balance:"+balance);
}
}

class CheckName extends Exception
{
CheckName(String s)
{
System.out.println("Invalid string"+s);
}
}

class CheckBalance extends Exception
{
CheckBalance(float bal)
{
while(bal<500)
{
System.out.println("Insufficient balance"+bal);
//break;
}
}
}


class Acc
{
public static void main(String args[])
{
int acc_no;
String name;
float balance;
BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
try
{
System.out.println("Enter account no");
acc_no=Integer.parseInt(br.readLine());
System.out.println("Enter the name");
name=br.readLine();
throw new CheckName(name);

System.out.println("Enter the balance");
}
balance=Float.parseFloat(br.readLine());
throw new CheckBalance(balance);
}
catch(CheckName e)
{
System.out.println("Invalid formate");
}

catch(CheckBalance e)
{
System.out.println("Insufficient balance");
}
catch(Exception e){}
}
}

