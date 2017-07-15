package Trees;

import java.util.Scanner;

public class TreeUse {
	// 1 2 4 -1 -1 5 -1 -1 3 6 -1 -1 7 -1 -1
	public static TreeNode<Integer> takeTreeInput(Scanner s) {
		System.out.println("Enter Root data:");
		int rootData=s.nextInt();
		if(rootData==-1)
		{
			return null;
		}
		TreeNode<Integer> root=new TreeNode<Integer>(rootData);
		root.left=takeTreeInput(s);
		root.right=takeTreeInput(s);	
		return root;

	}
	public static void printTree(TreeNode<Integer> root)
	{
		if(root==null)
		{
			System.out.print("-1");
			return;
		}
		System.out.println("Root data: "+root.data);
		System.out.print("Left Child of "+root.data+":");
		printTree(root.left);

		System.out.println("Right Child of "+root.data+":");
		printTree(root.right);


	}

	public static int sum(TreeNode<Integer> root)
	{
		if(root==null)
			return 0;
		
		int leftSum=0;
		int rightSum=0;
		if(root.left!=null)
		{
			leftSum=sum(root.left);
		}
		if(root.right!=null)
		{
			rightSum=sum(root.right);
		}
		return root.data+leftSum+rightSum;

	}
	public static int height(TreeNode<Integer> root)
	{
		if(root==null)
			return 0;
		/*
		if(root.left==null)
			return 1+height(root.right);
		else if(root.right==null)
			return 1+height(root.left);
		
		*/
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		
		if(leftHeight>rightHeight)
			return 1+height(root.left);
		else
			return 1+height(root.right);
			
		
		
	}
	public static int noOfNodes(TreeNode<Integer> root)
	{
		if(root==null)
			return 0;
		return 1+noOfNodes(root.left)+noOfNodes(root.right);
	}



	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		TreeNode<Integer> root=takeTreeInput(s);
		printTree(root);
		System.out.println("sum"+sum(root));
		System.out.println("Height"+height(root));
		System.out.println("No of nodes:"+noOfNodes(root));

	}


}
