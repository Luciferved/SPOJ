/*

A fashion show rates participants according to their level of hotness. Two different fashion shows were organized, one for men and the other for women. A date for the third is yet to be decided ;) .

Now the results of both fashion shows are out. The participants of both the fashion shows have decided to date each other, but as usual they have difficuly in choosing their partners. The Maximum Match dating serive (MMDS) comes to their rescue and matches them in such a way that that maximizes the hotness bonds for all couples.

If a man has been rated at hotness level x and a women at hotness level y, the value of their hotness bond is x*y.

Both fashion shows contain N participants each. MMDS has done its job and your job is to find the sum of hotness bonds for all the couples that MMDS has proposed.

Input

The first line of the input contains an integer t, the number of test cases. t test cases follow.

Each test case consists of 3 lines:

The first line contains a single integer N (1 <= N <= 1000).
The second line contains N integers separated by single spaces denoting the hotness levels of the men.
The third line contains N integers separated by single spaces denoting the hotness levels of the women.
All hotness ratings are on a scale of 0 to 10.

Output

For each test case output a single line containing a single integer denoting the sum of the hotness bonds for all pairs that MMDS has proposed.

Example

Input:
2
2
1 1
3 2
3
2 3 2
1 3 2

Output:
5
15


*/

import java.util.*;
class FashionShows
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		while(n!=0)
		{
			int len = src.nextInt();
			long a[] = new long[len];
			for(int i=0;i<a.length;i++)
			{
				a[i] = src.nextLong();
			}
			Arrays.sort(a);

			
			
			
			long b[] = new long[len];
			for(int i=0;i<b.length;i++)
			{
				b[i] = src.nextLong();
			}
			Arrays.sort(b);
			
			long sum = 0;
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(i==j)
						sum+=a[i]*b[j];
				}
			}
			System.out.println(sum);
			
		n--;
		}
	}
}