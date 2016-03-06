/*

Maricruz have a lot of cards, she always uses her cards to build pyramids as shown
in the following image:

Cards
A pyramid card of 3 leves.
She always wonder how many cards does she need to make a pyramid card of N
levels. Your task is to answer that question.
Input
The first line of the input contains an integer 1<= T <= 1,000. Each of the
following T lines will have an integer 1<= N <= 1,000,000.
Output
For each case, output a single line consisting of the number of cards needed to
build a pyramid card of level N modulo 1,000,007.


Input Example
2
3
7

Output Example
15
77



Logic :

1) gives time limit exceeded
	for(int i=1;i<=n;i++)
			{
				sum = sum+(i*2)+(i-1);
			}
			System.out.println(sum%1000007);


2)build formula...
	(n*(n+1))+(n*(n+1)/2-n);
	
how....

	level			formula				cards
	1			lev*(lev+1)+addtn		2
	
	2				2*3+1				7
				   ....+2
	3				3*4+3				15
					...+3
	4				4*5+6				26
				   ....+4		
	5				5*6+10				40
					....+5
	6				6*7+15				57
					....+6
	7				7*8+21				77
					....+7
	8				8*9+28				100
					....+8
	9				9*10+36				126
					....+9
	10				10*11+45			155



	for addition........
	level				addtn
	1					0
	2					1
	3					2
	4					3
	5					4
	6					5
	7					6
	8					7
	9					8
	10					9
	
	i.e n*(n+1)/2-n....-n coz for level 1 no adtn so..
	
	"FINAL FORMULA : (level*(level+1))+(level*(level+1)/2-n)"
*/
import java.util.*;
class CardPyramid
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int t = src.nextInt();
		while(t-->0)
		{
			long n = src.nextLong();
			long sum = 0;
			sum = (n*(n+1))+(n*(n+1)/2-n);
			sum = sum%1000007;
			System.out.println(sum);
			/*for(int i=1;i<=n;i++)
			{
				sum = sum+(i*2)+(i-1);
			}
			System.out.println(sum%1000007);*/
		}
	}
}

