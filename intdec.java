import java.util.*;

public class intdec
{
public static void main(String[] args)
{
boolean isInt=true;
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
char ch = s.charAt(0);
if(ch>='0' && ch<='9')
{
for(int i=1;i<s.length();i++)
{
char ch1=s.charAt(i);
if(ch1>='0' && ch1<='9')
{
isInt=true;
}
}
System.out.println(s+"is a integer");
}
else
{
double d=Double.parseDouble(s);
System.out.println(s+"it is a decimal constant");
}
}
}