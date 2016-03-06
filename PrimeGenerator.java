import java.util.*;
import java.io.*;
class PrimeGenerator
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			String str = br.readLine();
			String split[] = str.split(" ");
			int start = Integer.parseInt(split[0]);
			int end = Integer.parseInt(split[1]);
			generatePrime(start,end);
		}
	}
	
	private static void generatePrime(int s,int e)
	{	
		for(int i=s;i<=e;i++)
		{
			if(isPrime(i))	
				System.out.println(i);
		}
	}
	
	private static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		for(int i=2;i<Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}
		