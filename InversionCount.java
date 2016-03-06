import java.util.*;
class InversionCount
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int t = src.nextInt();
		while(t!=0)
		{
			long count = 0;
			int n = src.nextInt();
			long  a[] = new long[n];
			for(int i=0;i<a.length;i++)
			{
				a[i] = src.nextLong();
			}
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a.length;j++)
				{
					if(i<j && a[i]>a[j])
					{
						count++;
					}
				}
			}
		System.out.println(count);
		t--;
		}
	}
}