import java.io.*;
class AntiBlot
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t!=0)
		{
			String str = br.readLine();
			if(!(str.contains("machula")))
				System.out.println(str);
			if(str.length() <=0)
				str = br.readLine();
			str = str.replace(" ","");
			//System.out.println(str);
			int index1 = str.indexOf("+");
			//System.out.println(index1);
			int index2 = str.indexOf("=");
			//System.out.println(index2);
			String str1 = str.substring(0,index1);
			String str2 = str.substring(index1+1,index2);
			String str3 = str.substring(index2+1);
			if(str1.contains("machula"))
			{
				str1 = (Integer.parseInt(str3)-Integer.parseInt(str2))+"";
				System.out.println(str1+" + "+str2+" = "+str3);
			}
			else if(str2.contains("machula"))
			{
				str2 = (Integer.parseInt(str3)-Integer.parseInt(str1))+"";
				System.out.println(str1+" + "+str2+" = "+str3);
			}
			else if(str3.contains("machula"))
			{
				str3 = (Integer.parseInt(str1)+Integer.parseInt(str2))+"";
				System.out.println(str1+" + "+str2+" = "+str3); 
			}
			
			//System.out.println(System.currentTimeMillis());
		t--;
		}
	}
}