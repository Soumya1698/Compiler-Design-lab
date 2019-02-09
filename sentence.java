import java.util.*;


public class sentence 
{
public static void main(String args[])
{
int vowels[] = new int[20];
int consonents[]= new int[20];
Scanner sc = new Scanner(System.in);
String line=sc.nextLine(); // enters the string
String[] val = line.split(" ");
for(int i=0;i<val.length;i++)
{ 
System.out.println(val[i]);
}
 for(int i=0;i<val.length;i++)
{vowels[i] = 0;
consonents[i] = 0;}

for(int j=0;j<val.length;j++)
{
for(int i=0;i<val[j].length();i++)
{
char ch=val[j].charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
{
vowels[j] += 1;
}
else
{
consonents[j] += 1;
}
}
}
for(int i=0; i<val.length; i++)
{
System.out.println(val[i]); 
System.out.println(vowels[i]);
System.out.println(consonents[i]);
}
}
}
