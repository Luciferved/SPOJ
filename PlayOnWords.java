/*


USE Euler path algo 
*/

import java.util.*;
class PlayOnWords
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int t = src.nextInt();
		while(t!=0)
		{
			int n = src.nextInt();
			String str[] = new String[n];
			for(int i=0;i<str.length;i++)
			{
				str[i] = src.next();
			}
			boolean flag = false;
			for(int i=0;i<str.length-1;i++)
			{
				String st = str[i];
				//System.out.println("St : "+st);
				String st1 = str[i+1];
				//System.out.println("St1 : "+st1);
				//System.out.println("st : "+st.substring(st.length()-1));
				//System.out.println("st1 : "+st1.substring(0,1));
				
				if(st.substring(st.length()-1).equals(st1.substring(0,1)))
					flag = true;
				else
					flag = false;
					
			}
			if(flag)
				System.out.println("Ordering is possible.");
			else
				System.out.println("The door cannot be opened.");
				
				
		t--;
		}
	}
}