
public class Stack {
	
	 int arr[]=new int[10];
	 int top=-1;
	 int size=10;
	//public Stack()
	{
		
		
	}

	
	public void push(int v){
		
		
		if(top==size-1)
		{
			System.out.println("\nOverflow");
			
		}
		
		else 
		{
			top++;
			arr[top]=v;
		}
		
		
		
		
	}
	
	public void pop(){
		
		System.out.print("\nPOP");
		if(top==-1)
			System.out.println("\nUnderflow");
		else
		{
			
			System.out.println("Popping : "+arr[top]);
			arr[top]=0;
			top--;
		}
	}
	
	public void display(){
		
	for(int i=0;i<=top;i++)
		System.out.println(arr[i]);
	
	
	}
	
	
}
