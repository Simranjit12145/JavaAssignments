package abc.in;
import java.util.Scanner;
public class RemoveDuplicateList {
	Node head;
	static class Node
	{
		int key;
		Node next;
		Node(int data)
		{
			key=data;
		}
	}
	
	public static void insert(RemoveDuplicateList li,int d)
	{
		Node newNode=new Node(d);
		newNode.next=null;
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
	
	public static void display(Node head)
	{
		Node temp=head;
		while(temp.next!=null)
		{
			if(temp.key!=temp.next.key)
			{
				System.out.print(temp.key+"->");
			}
			temp=temp.next;
		}
		System.out.println(temp.key);
	}
	
public static void main(String args[])
{
	RemoveDuplicateList li=new RemoveDuplicateList();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements in the list");
	int n=s.nextInt();
	System.out.println("Enter elements");
	for(int i=0;i<n;i++)
	{
		insert(li,s.nextInt());
	}
	System.out.println("Linked list after removing duplicate elements is:-");
	display(li.head);
}
}
