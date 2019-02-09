import java.util.Scanner;

public class strtorev
{
public static void main(String[] args)
{
String[] rev= new String[20];
Scanner sc = new Scanner(System.in);
String ar=sc.nextLine();//enters the string
String[] arr=ar.split(" ");
for(int i=0;i<arr.length();i++)
{
System.out.println(arr[i]);
}
for(int i=0;i<arr.length;i++)
{  rev[i]=""; }
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length();j++)
{
rev[i]=rev[i]+arr[i].reverse(j);
}
}
for(int i=0;i<arr.length;i++)
{
System.out.println(rev[i]);
}
}
}

 