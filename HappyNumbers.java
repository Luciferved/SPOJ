import java.io.*;
import java.util.*;
class HappyNumbers
{
	static HashSet hs = new HashSet();
	
	static int count = 0;
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long sum = 0;
		long rem = 0;
		long count  = 0;
		while(sum!=1)
		{
			sum = 0;
			while(n!=0)
			{
				rem = n%10;
				sum+=Math.pow(rem,2);
				n = n/10;
			}
			n = sum;
			count++;
		}
		if(sum == 1)
			System.out.println(count);
		else
			System.out.println("-1");
	}
}
		
		
		