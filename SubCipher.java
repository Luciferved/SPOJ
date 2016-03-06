import java.io.*;
class SubCipher
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		String s = br.readLine();
		int n = Integer.parseInt(br.readLine());
		while(n>0)
		{
			String str = br.readLine();
			StringBuilder sb = new StringBuilder(str);
			for(int i=0;i<str.length();i++)
			{
				
				char ch = str.charAt(i);
				if(s.contains(ch+""))
				{
					int j = s.indexOf(ch);
					//System.out.println(j);
					int index = str.indexOf(ch);
					//System.out.println(index);
					
					//System.out.println(sch);
					
					if(!(j == (len-1)))
					{
						char sch = s.charAt(j+1);
						sb.setCharAt(index,sch);//str = str.replace(ch+"",s.charAt(j+1)+"");
					}
					else if(j == (len-1))
					{
						sb.setCharAt(index,s.charAt(0));
					}
				}
				str = sb.toString();
			}
			System.out.println(str);
			n--;
			
		}
	}
}

/*public static String smallest(int minIndex,String str)
	{
		char ch = str.charAt(minIndex);
		char chs = str.charAt(0);
		StringBuilder sb = new StringBuilder(str);
		sb.setCharAt(0,ch);
		sb.setCharAt(minIndex,chs);
		String smallest = sb.toString();
		return smallest;
	}*/