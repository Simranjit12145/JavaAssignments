package pac.in;
import java.util.Scanner;
public class Swap_pair 
{
	Node head;
	static class Node
	{
		int key;
		Node next;
		Node(int data)
		{
			key=data;
			next=null;
		}
	}
	
	public static void insert(Swap_pair li,int data)
	{
		Node newNode=new Node(data);
		if(li.head==null)
		{
			li.head=newNode;
		}
		else
		{
			Node last=li.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
	}
	
	public static void swap_pair(Swap_pair li)
	{
		Node temp=li.head;
		while(temp.next!=null)
		{
			System.out.print(temp.next.key+"->"+temp.key+"->");
			temp=temp.next.next;
		}
		System.out.println(temp.key);
	}
	
	public static void main(String args[])
	{
		Swap_pair li=new Swap_pair();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the linked list");
		int n=s.nextInt();
		System.out.println("Enter the elements of the linked list");
		for(int i=0;i<n;i++)
		{
			insert(li,s.nextInt());
		}
		swap_pair(li);
	}
}
