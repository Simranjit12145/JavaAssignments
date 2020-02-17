package pac.in;
import java.util.*;
public class SubMatrixSum {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int k=0;k<t;k++)
		{
			int r=s.nextInt();
			int c=s.nextInt();
			int ar[][]=new int[r][c];
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					ar[i][j]=s.nextInt();
				}
			}
			int x1=s.nextInt();
			int y1=s.nextInt();
			int x2=s.nextInt();
			int y2=s.nextInt();
			x1--;
			x2--;
			y1--;
			y2--;
			int sum=0;
			for(int i=x1;i<=x2;i++)
			{
				for(int j=y1;j<=y2;j++)
				{
					sum=sum+ar[i][j];
				}
			}
			System.out.print(sum);
		}
	}
}
