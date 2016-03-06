/*

Multiply the given numbers.

Input

 

n [the number of multiplications <= 1000]
l1 l2 [numbers to multiply (at most 10000 decimal digits each)]

Text grouped in [ ] does not appear in the input file.


 

Output

 

The results of multiplications.
 

Example

Input:
5
4 2
123 43
324 342
0 12
9999 12345

Output:
8
5289
110808
0
123437655

Showing NZEC Error
*/
import java.io.*;
import java.math.*;
class FastMultiply
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while(n!=0)
		{
			String str = br.readLine();
			String split[] = str.split(" ");
			BigInteger n1 = new BigInteger(split[0]);
			BigInteger n2 = new BigInteger(split[split.length-1]);
			//int n1 = Integer.parseInt(split[0]);
			//int n2 = Integer.parseInt(split[split.length-1]);
			System.out.println(multiply(n1,n2));
			n--;
		}
	}
	public static String multiply(BigInteger n1,BigInteger n2)
	{
		//BigInteger no1 = new BigInteger(n1+"");
		//BigInteger no2 = new BigInteger(n2+"");
		BigInteger mul = n1.multiply(n2);
		return mul.toString();
	}
}