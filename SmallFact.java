/*

You are asked to calculate factorials of some small positive integers.

Input

An integer t, 1<=t<=100, denoting the number of testcases, followed by t lines, each containing a single integer n, 1<=n<=100.

Output

For each integer n given at input, display a line with the value of n!

Example

Sample input:
4
1
2
5
3
Sample output:

1
2
120
6

Why BigInteger ??
	The maximum number that we can store in an unsigned 32 bit integer is 2 ^ 32 - 1 and in an unsigned 64 bit integer is 2 ^ 64 - 1. 
Something like 100!('!' is the notation for factorial) has over 150 decimal digits. 
The data types mentioned earlier can store numbers having at most 9 and 19 decimal digits respectively.

BigInteger(String val)
This constructor is used to translate the decimal String representation of a BigInteger into a BigInteger

The java.math.BigInteger.toString() returns the decimal String representation of this BigInteger.

*/

import java.util.*;
import java.math.*;
class SmallFact
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		while(n!=0)
		{
			int no = src.nextInt();
			System.out.println(fact(no));
			n--;
		}
	}
	public static String fact(int n)
	{
		BigInteger fact = new BigInteger("1");
		for(int i=1;i<=n;i++)
		{
			fact = fact.multiply(new BigInteger(i+""));
		}
		return fact.toString();
	}
}
			