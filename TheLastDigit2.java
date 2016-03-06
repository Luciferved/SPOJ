import java.util.*;
import java.math.*;
class TheLastDigit2
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int t = src.nextInt();
		while(t-->0)
		{
			String str = src.nextLine();
			String split[] = str.split(" ");
			int a = Integer.parseInt(split[0]);
			long b = Long.parseLong(split[1]);
			BigInteger no = new BigInteger(a);
			System.out.println(no.modPow(b,10));
		}
	}
}