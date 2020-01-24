package abc.in;
import java.util.Scanner;

import abc.in.ReverseLinkedlist.Node;
public class LinkedListReverse {
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

public static void insert(LinkedListReverse li,int d)
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

public void reverse(Node head)
{
	Node temp=head;
	if(temp.next!=null)
	{
		reverse(temp.next);
	}
	System.out.print(temp.key+"->");
}

public static void main(String args[])
{
	LinkedListReverse li= new LinkedListReverse();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number of elements in the list");
	int n=s.nextInt();
	System.out.println("Enter elemnts");
	if(n==0)
	{
		System.out.println("null");
	}
	else
	{
	for(int i=0;i<n;i++)
	{
		insert(li,s.nextInt());
	}
	li.reverse(li.head);
	System.out.println("null");
	}
}
}
