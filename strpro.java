import java.util.Scanner;
import java.lang.*;
public class strpro
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
if(s.charAt(0)>='a' && s.charAt(0)<='z' ||
   s.charAt(0)>='A' && s.charAt(0)<='Z'  ||
   s.charAt(0)>='_')
{
System.out.println(" it is a identifier");
}
else
{
 if(Character.isDigit(s.charAt(0)))
{
System.out.println(" is a digit"); }
else
{
for(int i=0;i<=s.length();i++)
{
if(s.charAt(i)=='e')
{
System.out.println(" is a exponential consatnt ");
} }
}
} } }

