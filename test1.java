import java.util.Scanner;

public class test1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str= sc.nextLine();
if(str.charAt(0)>='A' && str.charAt(0)<='Z')
{
System.out.println("it is a valid production\n"+ "lhs=" + str.charAt(0));
static validprod(str);
}
else
{
System.out.println(" it is not a valid production");
}
}
validprod(String st1)
{
for(int i=3;i<st1.length();i++)
{
if(st1.charAt(3)>='A' && st1.charAt(3)<='Z')
{
System.out.println("rhs is a non-terminal" + st1.charAt(3));
}
else{ System.out.println(" rhs is a terminal" + st1.charAt(3)); }
}
}
}