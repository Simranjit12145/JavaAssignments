package abc.in;
import java.util.Arrays;
import java.util.Scanner;
public class SecondLargest {
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
	Arrays.sort(arr);
	System.out.println("Largest -"+arr[n-1]);
	System.out.println("Second -"+arr[n-2]);
}
}
