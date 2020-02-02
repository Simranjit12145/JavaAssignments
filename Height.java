package pac.in;
import java.util.Scanner;
public class Height 
{
	static Node root;
	static class Node
	{
		int key;
		Node left;
		Node right;
		Node(int data)
		{
			key=data;
			left=null;
			right=null;
		}
	}
	
	public static void insert(int d)
	{
		root=insert(root,d);
	}
	
	public static Node insert(Node root,int key)
	{
		if(root==null)
		{
			root=new Node(key);
			return root;
		}
		else if(key<root.key)
		{
			root.left=insert(root.left,key);
		}
		else
		{
			root.right=insert(root.right,key);
		}
		return root;
	}
	
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		if(lh>rh)
			return lh+1;
		else
			return rh+1;
	}
	
	public static void main(String args[])
	{
		Height h=new Height();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of elements in the tree");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			insert(s.nextInt());
		}
		int ht=height(root);
		System.out.println("Height of the tree is :-");
		System.out.println(ht);
	}
}
