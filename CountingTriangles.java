/*Formula explanation		http://math.stackexchange.com/questions/203873/how-many-triangles	*/

import java.util.*;
import java.io.*;
class CountingTriangles
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
			long n = Long.parseLong(br.readLine());
			System.out.println(n*(2*n+1)*(n+2)/8);
		}
	}
}