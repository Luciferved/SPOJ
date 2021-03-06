/*


ACM needs to calculate with reversed numbers. Your task is to add two reversed numbers and output their reversed sum. Of course, the result is not unique because any particular number is a reversed form of several numbers (e.g. 21 could be 12, 120 or 1200 before reversing). Thus we must assume that no zeros were lost by reversing (e.g. assume that the original number was 12).

Input

The input consists of N cases (equal to about 10000). The first line of the input contains only positive integer N. Then follow the cases. Each case consists of exactly one line with two positive integers separated by space. These are the reversed numbers you are to add.

Output

For each case, print exactly one line containing only one integer - the reversed sum of two reversed numbers. Omit any leading zeros in the output.

Example

Sample input: 

3
24 1
4358 754
305 794

Sample output:

34
1998
1


*/
import java.util.*;
class ADDREV
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		{
			int n = src.nextInt();
			while(n!=0)
			{
				int n1 = src.nextInt();
				int n2 = src.nextInt();
				System.out.println(rev(rev(n1)+rev(n2)));
				n--;
			}
		}
	}
	public static int rev(int n)
	{
		int rev = 0;
		while(n!=0)
		{
			int r = n%10;
			rev = rev*10+r;
			n = n/10;
		}
		return rev;
	}
}
		