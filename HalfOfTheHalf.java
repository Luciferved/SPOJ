/*

Given a sequence of 2*k characters, please print every second character from the first half of the sequence. Start printing with the first character.

Input

In the first line of input your are given the positive integer t (1<=t<=100) - the number of test cases. In the each of the next t lines, you are given a sequence of 2*k (1<=k<=100) characters.

Output

For each of the test cases please please print every second character from the first half of a given sequence (the first character should appear).

Example

Input:
4
your 
progress 
is 
noticeable

Output:
y
po
i
ntc



your -> half -> yo -> start from 1st char print every second char -> y 
progress -> half -> prog -> start from 1st char, print every second char -> p o 
noticeable -> half -> notic -> start from 1st char print every second char(skip 1 char in the word each time when printing) -> n t c


*/
import java.util.*;
class HalfOfTheHalf
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		while(n!=0)
		{
			String str = src.next();
			str = str.substring(0,str.length()/2);
			for(int i=0;i<str.length();i+=2)
			{
				System.out.print(str.charAt(i));
			}
			System.out.println();
		n--;
		}
	}
}