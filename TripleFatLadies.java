/*

Pattern Matchers have been designed for various sorts of patterns. Mr. HKP likes to observe patterns in numbers. After completing his extensive research on the squares of numbers, he has moved on to cubes. Now he wants to know all numbers whose cube ends in 888.

Given a number k, help Mr. HKP find the kth number (indexed from 1) whose cube ends in 888.

Input

The first line of the input contains an integer t, the number of test cases. t test cases follow.

Each test case consists of a single line containing a single integer k (1 <= k <= 2000000000000).

Output

For each test case, output a single integer which denotes the kth number whose cube ends in 888. The result will be less than 263.

Example

Input:
1
1

Output:
192


*/


import java.io.*;
class TripleFatLadies
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t!=0)
		{
			long n = Long.parseLong(br.readLine());
			long ans = 192+(n-1)*250;
			System.out.println(ans);
		t--;
		}
	}
}