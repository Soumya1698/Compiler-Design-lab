import java.util.Scanner;


public class val
{
	public static void main(String[] args)
	{
	   int flag=0;
		Scanner sc = new Scanner(System.in);
	   String s;
                 s =sc.nextLine();
				
	  
	
	if(s.charAt(0)>='A' && s.charAt(0)<='Z')
	{
		for(int i=3;i<s.length();i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' ||s.charAt(i)>='A' && s.charAt(i)<='Z'  ||s.charAt(i)=='/' || 
				s.charAt(i)=='+' || s.charAt(i)=='*' || s.charAt(i)=='(' || s.charAt(i) ==')' )
			{
			  flag =1;
		        }
		 }
	}

	else
	{
		System.out.println(" it is not a valid production");
	}
	}
		if(flag=1)
		{
			System.out.println(" it is a valid identifier");
		}
}
