package LinkedList;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;

	int length; 

	public boolean isEmpty()
	{
		if(length==0)
			return true;
		else
			return false;
	}

	public int size() {
		return length;
	}

	public void print() {
		Node<T> ptr=head;
		if(head==null)
		{
			System.out.println("Empty List");
			return;
		}

		while(ptr!=null)
		{
			System.out.print(ptr.data+"-->");
			ptr=ptr.next;
		}
	}

	public void remove(int i) {
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		else if(i>=length || i<0)
		{
			System.out.println(i+" is an invalid position to insert");
			return;
		}
		else if(i==0)
		{
			removeFirst();
			return;
		}
		else if(i==length-1)
		{
			removeLast();
			return;
		}
		
		else
		{
			Node<T> ptr=head;
			while(i>1)
			{
				ptr=ptr.next;
				i--;
			}
			ptr.next=ptr.next.next;
			length--;
		}
	}

	public void removeFirst() {
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		head=head.next;
	}

	public void removeLast() {
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		Node<T> ptr=head;
		int i=length-1;
		while(i>1)
		{
			ptr=ptr.next;
			i--;
		}
		ptr.next=null;
		tail=ptr;

	}

	public void insert(int i, T element) {
		Node<T> newHead=new Node<T>(element);
		Node<T> ptr=head;
		if(i>=length || i<0)
		{
			System.out.println(i+" is an invalid position to insert");
			return;
		}
		if(i==0)
		{
			addToFront(element);
			return;
		}
		else if(i==length-1){
			addToBack(element);
			return;
		}

		else{
			while(i>1)
			{
				ptr=ptr.next;
				i--;
			}
			newHead.next=ptr.next;
			ptr.next=newHead;
			length++;
		}

	}

	public void addToFront(T element) {

		Node<T> newHead=new Node<T>(element);
		if(head==null)
		{
			head=newHead;
			tail=newHead;
		}
		else
		{
			newHead.next=head;
			head=newHead;
		}
		length++;

	}

	public void addToBack(T element) {
		Node<T> newNode=new Node<T>(element);
		if(tail==null)
		{
			head=newNode;
			tail=newNode;
		}

		else
		{
			tail.next=newNode;
			tail=newNode;
		}
		length++;

	}

}
