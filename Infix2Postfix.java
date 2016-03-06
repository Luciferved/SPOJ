/*


Transform the algebraic expression with brackets into RPN form (Reverse Polish Notation). Two-argument operators: +, -, *, /, ^ (priority from the lowest to the highest), brackets ( ). Operands: only letters: a,b,...,z. Assume that there is only one RPN form (no expressions like a*b*c).

Input

t [the number of expressions <= 100]
expression [length <= 400]
[other expressions]
Text grouped in [ ] does not appear in the input file.

Output

The expressions in RPN form, one per line.
Example

Input:
3
(a+(b*c))
((a+b)*(z+x))
((a+t)*((b+(a+c))^(c+d)))

Output:
abc*+
ab+zx+*
at+bac++cd+^*


*/


import java.util.*;
class Infix2Postfix
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		while(n!=0)
		{
			String str = src.next();
			System.out.println(infix2postfix(str));
			n--;
		}
	}
	public static String infix2postfix(String str)
	{
		Stack s = new Stack();
		String result = "";
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(isOperand(ch))
			{
				result = result+ch;
			}
			else if(isOperator(ch))
			{
				
				while(!s.empty() && HasHigherPrec((char)s.peek(),ch))
				{
					result = result+s.peek();
					s.pop();
				}
				s.push(ch);
			}
			else if(ch == '(')
			{
				s.push(ch);
			}
			else if(ch == ')')
			{
				while(!s.empty() && (char)s.peek()!='(' )
				{
					result+=s.peek();
					s.pop();
				}
				s.pop();
			}
		}
		while(!s.empty())
		{
			result+=s.peek();
			s.pop();
		}
		
		return result;
		
	}
	
	public static boolean isOperand(char c)
	{
		if(c>='0' && c<='9') 
			return true;
		if(c>='a' && c<='z') 
			return true;
		if(c>='A' && c<='Z') 
			return true;
		return false;
	}
	
	public static boolean isOperator(char c)
	{
		if(c =='+' || c=='-' || c=='/' || c=='*' || c=='^')
			return true;
		return false;
	}
	
	public static boolean HasHigherPrec(char c1,char c2)
	{
		if((c2 == '+' || c2 == '-') && (c1 == '+' || c1 == '-'))
			return true;
		else if((c2 == '*' || c2 == '/') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
			return true;
		else if((c2 == '^') && (c1 == '+' || c1 == '-' || c1 == '*' || c1 == '/'))
			return true;
		else
			return false;
	}
}	
