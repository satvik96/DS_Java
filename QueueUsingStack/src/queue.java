
public class queue {
	
	
	int arr[]=new int[10];
	int rear,front;
	int currsize,size;

	public queue()
	{
	
		rear=front=-1;
		size=10;
		currsize=0;
		
		
	}
	
	public void push(int v)
	{
		//System.out.println(v);
		if(rear==size-1)
			System.out.println("Overflow");
		
		else if(front==rear&&front==-1)
		{
			front=rear=0;
			arr[rear]=v;
			currsize++;
		}
		else 
		{
			rear++;
			arr[rear]=v;
			currsize++;
		}
		
		
	}
	
	public void pop(){
		//System.out.println("pop");
		
		if(front==-1)
			System.out.println("Underflow");
		
		else if(front==rear&&front!=-1&&front!=0)
			System.out.print("\nUnderflow");
		else 
		{
			System.out.println("Popping: "+arr[front]);
			arr[front]=0;
			front++;
			
		}
		
		
		
		
	}
	
	public void display(){
		
		for(int i=front;i<=rear;i++)
			System.out.print(arr[i]+" -> ");
		
		System.out.println("Front:"+front);
		System.out.print("Rear"+rear);
	
	}
	
}
	
	
	
	
	
