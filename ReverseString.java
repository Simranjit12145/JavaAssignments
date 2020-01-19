package abc.in;
import java.util.Scanner;
public class ReverseString {
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of strings");
    System.out.println("Enter the strings");
    int t=s.nextInt();
    for(int i=0;i<t;i++)
    {
    	String str=s.next();
    	String str1[]=str.split("\\.");
    	int n=str1.length;
    	for(int j=n-1;j>0;j--)
    	{
    		System.out.print(str1[j]+".");
    	}
    	System.out.print(str1[0]);
    	System.out.println();
    }
}
}
