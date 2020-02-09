package pac.in;
import java.util.Scanner;

public class RotateLinkedList 
{
	Node head;
//	static int count;
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
	
	public  RotateLinkedList insert(RotateLinkedList li,int data)
	{
		Node newNode=new Node(data);
		if(li.head==null)
		{
			li.head=newNode;
			return li;
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
		return li;
	}
	
	public static RotateLinkedList rotate(RotateLinkedList li,int k)
	{
		Node temp=li.head;
		int n=0;
		RotateLinkedList rli=new RotateLinkedList();
		while(temp!=null)
		{
			n++;
			temp=temp.next;
		}
		int arr[]=new int[n];
		temp=li.head;
		for(int i=0;i<n;i++)
		{
			arr[i]=temp.key;
			temp=temp.next;
		}
		for(int i=k;i<n;i++)
		{
			rli.insert(rli, arr[i]);
		}
		for(int i=0;i<k;i++)
		{
			rli.insert(rli, arr[i]);
		}
		return rli;
	}
	
	public  void display(RotateLinkedList li)
	{
		Node temp=li.head;
		while(temp!=null)
		{
			System.out.print(temp.key+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String args[])
	{
		RotateLinkedList li=new RotateLinkedList();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the linked list");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			li.insert(li,s.nextInt());
		}
		System.out.println("Enter the no. of rotations");
		int k=s.nextInt();
		li=rotate(li,k);
		li.display(li);
		s.close();
	}
}
