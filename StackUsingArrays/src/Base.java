import java.util.Scanner;

public class Base {
	
	public static void main(String []args)
	
	{
		Stack obj=new Stack();
		
		int n=1;
		do{
			
					System.out.print("Press 1 to push:\nPress 2 to pop:");
					
					Scanner x=new Scanner(System.in);
					int ch=x.nextInt();
					
					switch(ch)
					{
					case 1:	System.out.print("Enter value to push:");
							int val=x.nextInt();
							obj.push(val);
							obj.display();
							break;
							
							
					case 2: obj.pop();
					obj.display();
							break;
							
					
					
					default:
							System.out.print("\nInvalid Input");
							break;
					
						
					}
					System.out.print("\nPress 0 to continue");
					n=x.nextInt();
					
					
		}while(n==0);
		
	}



}
