/*


There are G girl students and B boy students in a class that is about to graduate. You
need to arrange them in a single row for the graduation. To give a better impression of
diversity, you want to avoid having too many girls or too many boys seating consecutively.
You decided to arrange the students in order to minimize the gender regularity. The
gender regularity of an arrangement is the maximum number of students of the same
gender (all girls or all boys) that appear consecutively.
Given G and B, calculate the minimum gender regularity among all possible arrange-
ments.

Input

Each test case is described using a single line. The line contains two integers G and B
representing the number of girls and boys in the class, respectively (0 ≤ G, B ≤ 1000).
The end of input is indicated with a line containing the number −1 twice.

Output

For each test case, output a single line with a single integer representing the minimum
gender regularity that an arrangement of G girls and B boys can have.

Example

Input: 
10 10
5 1
0 1000
-1 -1

Output: 
1
3
1000

LOGIC : consider 5(b) 1(g)
		take min...
		divide max accodin 2 min...
		i.e
					| *  |G|  *  |
		at * place 5 boys can be arranged..to solve..
		
		add 1 to smallest nd / it to max...
		
		if result is int---print
		
		if result is float den convert to int and add 1..


*/


import java.io.*;
class GirlsndBoys
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			String str = br.readLine();
			String split[] = str.split(" ");
			int n1 = Integer.parseInt(split[0]);
			int n2 = Integer.parseInt(split[1]);
			if(n1>=0 && n2>=0)
				System.out.println(minGenderRegularity(n1,n2));
			else
				break;
		}
	}
	
	private static int minGenderRegularity(int n1,int n2)
	{
		double res = 0;
		if(n1 == 0 || n2 == 0)
		{
			return Math.max(n1,n2);
		}
		else if(n1 == n2)
		{
			return 1;
		}
		else
		{
			double min = Math.min(n1,n2);
			//System.out.println("Min : "+min);
			double max = Math.max(n1,n2);
			//System.out.println("Max : "+max);
			res = max/(min+1);
			//System.out.println(res);
			if(res%1 == 0)
				return (int)res;
			if(res%1!=0)
				return (int)res+1;
			return -1;
		}
	}
}