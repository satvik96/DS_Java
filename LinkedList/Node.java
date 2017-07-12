package LinkedList;

import java.util.Scanner;

public class Node<T>{

	public T data;
	public Node<T> next;
	
	
	public Node(T data)
	{
		this.data=data;
		this.next=null;
	}
	
	
	public Node() {
		// TODO Auto-generated constructor stub
		this.data=null;
		this.next=null;
	}



/*
	public static int sum ()
	{
		
	}
	public static int length ()
	{
		
	}
	
	public static Node<Integer> reverse()
	{}
	
	*/
	
//	public static void printll()
//	{
//		/*
//		if(head==null)
//			System.out.println("Empty ");
//		else
//		{
//			while(head!=null)
//			{
//			System.out.println(head.data+"->");
//			head=head.next;
//			}
//		}
//		*/
//		
//		while (this.head != null) {
//			System.out.print(this.head.data + "-->");
//			this.head = this.head.next;
//		}
//		System.out.println();
//	}
	
}
