import java.util.Scanner;


public class valpro
{
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   String[] s = new String[20];  /* enters a string */
	   for(int i=0;i<s.length;i++)
	   {
		s[i]=sc.newLine();
	   }
	
	if(s.charAt(0)>='A' && s.charAt(0)<='Z')
	{
		for(int i=3;i<s.length;i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z' ||s.charAt(i)>='A' && s.charAt(i)<='Z'  ||
			s.charAt(i)=='/' || s.charAt(i)=='+' || s.charAt(i)=='*' || s.charAt(i)=='(' || s.charAt(i) ==')' )
			{
				System.out.println(" it is a valid production "); 
		        }
		 }
	}

	else
	{
		System.out.println(" it is not a valid production");
	}
	}
}
