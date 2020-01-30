package pac.in;
import java.util.Scanner;
public class WindowSize {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the size of the array");
	int n=s.nextInt();
	int max;
	int arr[]=new int[n];
	System.out.println("Enter elements");
	for(int i=0;i<n;i++)
	{
		arr[i]=s.nextInt();
	}
	System.out.println("Enter the window size");
	int ws=s.nextInt();
	for(int i=0;i<n-ws+1;i++)
	{
		max=arr[i];
		for(int j=i+1;j<i+ws;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
		}
		System.out.print(max+" ");
	}
}
}
