package pac.in;
import java.util.*;
public class SherlockString {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch[]=str.toCharArray();
		int n=ch.length;
		int freq[]=new int[n];
		int count=0;
		int arr[]=new int[30];
		int k=0;
		int flag=0;
		for(int i=0;i<n;i++)
		{
			freq[i]=-1;
		}
		for(int i=0;i<n;i++)
		{
			if(freq[i]!=0)
			{
				count=1;
				for(int j=i+1;j<n;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						freq[j]=0;
					}
				}
				if(freq[i]!=0)
				{
					arr[k]=count;
					k++;
				}
			}
		}
		int ar[]=new int[k];
		
		for(int i=0;i<k;i++)
		{
			ar[i]=arr[i];
		}
		
		Arrays.sort(ar);
		
		if(arr[k-1]!=arr[k-2])
		{
			arr[k-1]--;
		}
		
		for(int i=0;i<k-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				flag=1;
			}
		}
		if(flag==1)
			System.out.println("No");
		else
			System.out.println("Yes");
	}
}
