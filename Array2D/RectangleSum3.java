package Array2D;

import java.util.Scanner;

public class RectangleSum3 {
	static int findSum(int[][]matrix,int l1,int r1,int l2,int r2)
	{
		int sum=0;
		for(int i=l1;i<=l2;i++)
		{
			for(int j=r1;j<=r2;j++)
			{
				sum+=matrix[i][j];
			}
		}
		return sum;
	}
	
	static void findPrefixSum(int[][]matrix)
	{
		int r=matrix.length;
		int c=matrix[0].length;
		//traverse horizently to calculate row wise prefix sum
		for(int i=0;i<r;i++)
		{
			for(int j=1;j<c;j++)
			{
				matrix[i][j]+=matrix[i][j-1];
			}
		}
	}
	//calculate row wise and column wise sum
	//matrix[i][j]=sumRectangle((0,0) (i,j))
	static void findPrefixSum3(int[][]matrix)
	{
		int r=matrix.length;
		int c=matrix[0].length;
		//traverse horizently to calculate row wise prefix sum
		for(int i=0;i<r;i++)
		{
			for(int j=1;j<c;j++)
			{
				matrix[i][j]+=matrix[i][j-1];
			}
		}
		// traverse vartically to calculate column wise sum
		for(int j=0;j<c;j++)// fixing column
		{
			for(int i=1;i<r;i++)
			{
				matrix[i][j]+=matrix[i-1][j];
			}
		}
	}
	
	static int findSum2(int[][]matrix,int l1,int r1,int l2,int r2)
	{
		int sum=0;
		findPrefixSum(matrix);
		
		for(int i=l1;i<=l2;i++)
		{
			//r1 to r2 sum for row i
			if(r1>=1)
				sum+=matrix[i][r2]-matrix[i][r1-1];
			else
				sum+=matrix[i][r2];
		}
		
		return sum;
	}
	
	static int findSum3(int[][]matrix,int l1,int r1,int l2,int r2)
	{
		int ans=0;
		int sum=0,up=0,left=0,leftup=0;
		findPrefixSum3(matrix);
		
		sum=matrix[l2][r2];
		if(r1>=1)
			left=matrix[l2][r1-1];
		if(l1>=1)
			up=matrix[l1-1][r2];
		if(l1>=1&&r1>=1)
			leftup=matrix[l1-1][r1-1];
		
		ans=sum-up-left+leftup;
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows and columns of matrix 1");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] matrix=new int[r][c];
		System.out.println("enter matrix values");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter rectangle boundries l1, r1, l2, r2 ");
		int l1=sc.nextInt();
		int r1=sc.nextInt();
		int l2=sc.nextInt();
		int r2=sc.nextInt();
		
		System.out.println("Rectangle Sum "+findSum(matrix,l1,r1,l2,r2));
//		System.out.println("Rectangle Sum "+findSum2(matrix,l1,r1,l2,r2));
		System.out.println("Rectangle Sum "+findSum3(matrix,l1,r1,l2,r2));

	}

}
