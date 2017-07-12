package LinkedList;

public class inbulit_ll_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<Integer> mylist=new LinkedList<Integer>();
		//mylist.print();
				
		mylist.addToBack(40);
		mylist.addToBack(50);
		mylist.addToFront(10);
		mylist.addToFront(20);
		mylist.addToFront(30);
		mylist.insert(2, 100);
		mylist.insert(5, 200);
		
		mylist.print();
		
		System.out.println(mylist.isEmpty());
		mylist.remove(1);
		mylist.removeFirst();
		mylist.removeLast();
		
		mylist.print();
		System.out.println(mylist.size());
	}

}


