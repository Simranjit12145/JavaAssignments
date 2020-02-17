package pac.in;
import java.util.*;
public class StringComparison {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int k=0;k<t;k++)
		{
			String str1=s.next();
			String str2=s.next();
			int flag=0;
			char ch1[]=str1.toCharArray();
			char ch2[]=str2.toCharArray();
			for(int i=0;i<ch1.length;i++)
			{
				flag=0;
				for(int j=0;j<ch2.length;j++)
				{
					if(ch1[i]==ch2[j])
					{
						flag=1;
					}
				}
				if(flag!=1)
				{
					System.out.print(ch1[i]);
				}
			}
			for(int i=0;i<ch2.length;i++)
			{
				flag=0;
				for(int j=0;j<ch1.length;j++)
				{
					if(ch2[i]==ch1[j])
					{
						flag=1;
					}
				}
				if(flag!=1)
				{
					System.out.print(ch2[i]);
				}
			}
			System.out.println();
		}
	}
}
