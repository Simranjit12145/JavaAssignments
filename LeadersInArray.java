package abc.in;
import java.util.Scanner;
public class LeadersInArray {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=s.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements of the array");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	s.close();
	int flag=0;
	for(int i=0;i<n;i++)
	{
		flag=0;
		for(int j=i+1;j<n;j++)
		{
			if(arr[i]>=arr[j])
			{
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			System.out.print(arr[i]+" ");
		}
	}
	System.out.println(arr[n-1]);
}
}
