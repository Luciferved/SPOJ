/*

Nestor was doing the work of his math class about three days but he is tired of make operations a lot and he should deliver his task tomorrow. His math’s teacher gives two numbers a and b. The problem consist in find the last digit of the potency of base a and index b. Help Nestor with his problem. You are given two integer numbers: the base a (0 <= a <= 20) and the index b (0 <= b <= 2,147,483,000), a and b both are not 0. You have to find the last digit of a^b.

Input

The first line of input contains an integer t, the number of test cases (t <= 30). t test cases follow. For each test case will appear a and b separated by space.

Output

For each test case output an integer per line representing the result.

Example

Input:
2
3 10
6 2

Output:
9
6

*/

import java.util.*;
import java.math.*;
class TheLastDigit
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		while(n!=0)
		{
			BigInteger n1 = src.nextBigInteger();
			BigInteger n2 = src.nextBigInteger();
			BigInteger last = n1.modPow(n2,new BigInteger("10"));
			System.out.println(last);
		n--;
		}
	}
}