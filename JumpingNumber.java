package pac.in;

import java.util.Scanner;

public class JumpingNumber 
{
	public static void main(String args[]) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of testcases");
		int t = s.nextInt();
		for (int i = 0; i < t; i++) 
		{
			System.out.println("\nEnter the number");
			int a = s.nextInt();
			int digits=a;
			int div, rem,count=0;
//            while(digits!=0)
//            {
//            	digits=digits/10;
//            	count++;
//            }
            
			for (int j = 0; j <= a; j++) 
			{
				if (j <= 10) 
				{
					System.out.print(j + " ");
				} 
				else 
				{
					div = j / 10;
					rem = j % 10;
					if (div - rem == 1 || div - rem == -1) 
					{
						System.out.print(j + " ");
					}
				}
			}
		}
	}
}
