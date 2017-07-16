package Stack;

import java.util.Stack;

public class Stack_inbuilt {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.add(2, 5);
		System.out.println(stack.isEmpty());
		System.out.println(stack);
		System.out.println(stack.capacity());
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.get(2));
		System.out.println(stack.contains(10));
		

	}

}
