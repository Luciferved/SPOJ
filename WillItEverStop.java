/*

When Bob was in library in University of Warsaw he saw on one of facades caption :"Will it ever stop?" and below some mysterious code:

while n > 1
  if n mod 2 = 0 then
    n:=n/2
  else
    n:=3*n+3

Help him finding it out !
Input

In first line one number n<=10^14.

Output

Print "TAK" if program will stop, otherwise print "NIE"

Example

Input:
4

Output:
TAK

Logic : "check whether number is power of 2 or not."


************************Sexy BitWise Solution to determine whether no is power of two or not******************************


Consider that any number that is a power of 2 has exactly one bit set in its binary representation e.g.:

2    =  00000010 
4    =  00000100 
8    =  00001000 
16   =  00010000 
256  = 100000000
If we subtract 1 from any of these numbers we get the following:

2 - 1 = 1 = 00000001 
4 - 1 = 3 = 00000011 
8 - 1 = 7 = 00000111
Every bit that was less significant than the original interesting bit (the one that was set), is now set while the original bit is unset. If we now do a bitwise and (& operator) on the original number and the number which results when 1 is subtracted, we always get zero:

2 & 1 = 00000010 & 00000001 = 0 
8 & 7 = 00001000 & 00000111 = 0
This will only happen if a number is a power of two. Therefore we can write the following code:

def power_of_2?(number)
 number != 0 && number & (number - 1) == 0
end
This is apparently a pretty well known way to determine if a number is a power of 


*/
import java.util.*;
import java.io.*;
class WillItEverStop
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		System.out.println(WillItEverStop(n));
	}
	private static String WillItEverStop(long n)
	{
		while(n%2==0)
			n = n/2;
		if(n>1)
			return "NIE";
		
	return "TAK";
	}
}