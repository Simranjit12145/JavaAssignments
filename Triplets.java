package pac.in;
import java.util.*;
public class Triplets {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						flag=1;
					}
				}
			}
		}
		if(flag==1)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}
}
