import java.util.Scanner;
public class base1 {
	
	
	public static void main(String args[])
	{
		Scanner x= new Scanner(System.in);
		int n=0;
		queue obj=new queue();
		do{
			System.out.println("Press 1 to push\nPress 2 to pop:");
			
			int ch=x.nextInt();
				switch(ch)
				{
				
						case 1:		System.out.println("\nEnter value to be pushed:");
									int val=x.nextInt();
									obj.push(val);
									obj.display();
									break;
						
										
						case 2:		obj.pop();
									obj.display();
									break;
						
					
						default:	System.out.println("\nInvalid Input");
						
				}
				
				System.out.print("Press 0 to continue!");		
		n=x.nextInt();
		}while(n==0);
		
		
	}

}
