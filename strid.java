import java.util.*;

public class Strid
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
String arr= sc.nextLine(); // enters a string
char ch=arr.charAt(0);
char ch1=arr.charAt(1);
if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' 
  ||
  ch1>='a' && ch1<='z' || ch1>='A' && ch1<='Z' )
{
System.out.println(arr+ "is a String identifier");
}
else
{
System.out.println(arr+ " is not an String identifier");
}
}
}