
import java.util.Scanner;

class w5s1
{
public int sol1(String str)
{
String lhs = new String();
String rhs[]= new String[10];
int noa;
int flag=1;
lhs[0]=str.charAt(0);
for(int i=3;i<str.length();i++)
{
while(i!='/') {
for(int j=0;j<rhs[j].length();j++)
{
if(lhs[0]==rhs[j].charAt(j))
{
flag=1;
}
else
flag = 0; }
return 0;
}
}
}
}

class sol extends w5s1
{
public sol()
{
if(flag==1)
{
System.out.println("It has left recurssion");
}
else
{
System.out.println("It does not have left recurssion"); 
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the production");
String str = sc.nextLine();
sol s1 = new sol();
w5s1 s2 = new w5s1();
s2.sol2(str);
}
}

