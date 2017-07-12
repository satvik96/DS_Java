package LinkedList;
import java.util.*;

public class Nodeuse {

	public static Node<Integer> takeinput()
	{
		Scanner s=new Scanner(System.in);
		Node<Integer> head=null;
		Node<Integer> tail=null;
		
		int data=s.nextInt();
		while(data!=-1)
		{
			Node<Integer> node=new Node<Integer>(data);
			
			if(head==null)
			{
				head=node;
				tail=node;
			}
			else
			{
				tail.next=node;
				tail=node;
			}
			data=s.nextInt();
					
		}
		return head;
		
	}
	
	public static void printll(Node<Integer> head)
	{
		
		if(head==null)
			System.out.println("Empty ");
		else
		{
			while(head!=null)
			{
			System.out.print(head.data+"->");
			head=head.next;
			}
		}
		
		
		while (head != null) {
			System.out.print(head.data + "-->");
			head = head.next;
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		Node<Integer> head =new Node<Integer>();
		head=takeinput();
		printll(head);
		
		
		//LinkedList<Integer> list=new LinkedList<Integer>();
		//list.addToBack(10);
		
		LinkedList<Integer> li= new LinkedList<Integer>();
		//Node<Integer> obj=new Node<Integer>();
		
		
		
		
		

	}

}
