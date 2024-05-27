package Array2D;

import java.util.Scanner;

public class MarixRotation {
	
	static void printMatrix(int[][]matrix)
	{
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void transposeInplace(int[][]matrix,int r,int c)
	{
		for(int i=0;i<c;i++)
		{
			for(int j=i;j<r;j++)
			{
				//swap matrix[i][j],matrix[j][i]
				int temp=matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=temp;
			}
		}
	}
	
	static void reverseArray(int[]arr)
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	
	static void rotate(int[][]matrix,int n)
	{
		//transpose
		
		transposeInplace(matrix,n,n);
		//reverse each row of transpose matrix
		for(int i=0;i<n;i++)
		{
			reverseArray(matrix[i]);
		}
		
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
		System.out.println("input Matrix ");
		printMatrix(matrix);
		rotate(matrix,r);
		System.out.println("Rotation of matrix");
		printMatrix(matrix);

	}

}
