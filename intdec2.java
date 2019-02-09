import java.util.*;
import java.lang.*;
import java.io.*;

public class intdec2
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int flag=0,i=0;
isConstant c1 = new isConstant(s);
c1.intdec(s);
if(flag==0)
{
System.out.println(s+"is a integer");
}
else if(flag==1)
{
System.out.println(s+"is a decimal constant");
}
else { System.out.println(" sorry not found"); }
}
}
class isConstant
{ 
int intdec(String s){
if(isDigit(s.charAt(0)))
{
for(i=1;i<=s.length();i++)
{
if(isDigit(s.charAt(i)))
continue;
else if(s.charAt(i)=='.' && flag=0)
{
flag=1;
for(int j=i+1;j<=s.length();j++)
{
if(isDigit(s.charAt(j)))
continue;
else
break;
}
else break;
} } } }
if(i=s.length())
{ return flag; }
return 0;
}
