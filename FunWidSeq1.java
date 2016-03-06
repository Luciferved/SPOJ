/*

You are given a sorted sequence of n integers S = s1, s2, ..., sn and a sorted sequence of m integers Q = q1, q2, ..., qm. Please, print in the ascending order all such si that does not belong to Q.

Input data specification

In the first line you are given one integer 2<=n<=100, and in the following line n integers: 
-100 <= si <= 100, si <= si+1.

In the third line you are given one integer 2<=m<=100, and in the following line m integers: 
-100 <= qi <= 100, qi <= qi+1.

Output data specification

The sequence of requested integers separated by spaces.

Example

Input:
5
-2 -1 0 1 4
6
-3 -2 -1 1 2 3
Output:
0 4


*/
import java.util.*;
class FunWidSeq1
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		Integer a[] = new Integer[n];
		for(int i=0;i<a.length;i++)
		{
			a[i] = src.nextInt();
		}
		
		int m = src.nextInt();
		Integer b[] = new Integer[m];
		for(int i=0;i<b.length;i++)
		{
			b[i] = src.nextInt();
		}
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>(Arrays.asList(a));
		TreeSet<Integer> ts2 = new TreeSet<Integer>(Arrays.asList(b));
		ts1.removeAll(ts2);
		
		Iterator it = ts1.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
	}
}