/*

Try wid different logic


import java.util.*;
import java.math.*;
class TFL
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		long n = src.nextLong();
		while(n!=0)
		{
			long no = src.nextLong();
			long cube = 192+250*(no-1);
			System.out.println(cube);
		n--;
		}
	}
}

*/



/*

Time limit exceeded

*/


import java.util.*;
import java.math.*;
class TFL
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		long n = src.nextLong();
		while(n!=0)
		{
			long no = src.nextLong();
			long count = 0;
			long cube = 0;
			long i = 192;
			while(count!=no)
			{
				cube = (long)Math.pow(i,3);
				String str = cube+"";
				if(str.contains("E"))
					str = str.replace(str.substring(str.length()-2),"");
				if(str.substring(str.length()-3).equals("888"))
					count++;
				if(count == no)
					break;
				i++;
					
			}
			System.out.println(i);
		n--;
		}
	}
}