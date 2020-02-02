package pac.in;
import java.util.Scanner;
import java.util.Stack;
public class MinElementInStack {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		Stack<Integer>stack=new Stack<>();
		System.out.println("Enter the size");
		int n=s.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			stack.push(s.nextInt());
		}
		int min=stack.get(0);
		for(int i=0;i<n;i++)
		{
			if(stack.get(i)<min)
			{
				min=stack.get(i);
			}
		}
		System.out.println(min);
	}
}
