package Array2D;

import java.util.Scanner;

public class PrintSpiral2 {
	
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
	
	static void printSpiralOrder(int[][]matrix,int r,int c)
	{
		int topRow=0,bottomRow=r-1,leftCol=0,rightCol=c-1;
		int totalElement=0;
		while(totalElement<r*c)
		{
			//top row->leftcol to rightcol
			for(int j=leftCol;j<=rightCol && totalElement<r*c;j++)
			{
				System.out.print(matrix[topRow][j]+" ");
				totalElement++;
			}
			topRow++;
			
			//rightcol-> topRow to BottomRow
			for(int i=topRow;i<=bottomRow && totalElement<r*c;i++)
			{
				System.out.print(matrix[i][rightCol]+" ");
				totalElement++;
			}
			rightCol--;
			
			//bottomRow ->rightcol to leftcol
			for(int j=rightCol;j>=leftCol && totalElement<r*c;j--)
			{
				System.out.print(matrix[bottomRow][j]+" ");
				totalElement++;
			}
			bottomRow--;
			
			//leftcol->bottomRom to topRow
			for(int i=bottomRow;i>=topRow && totalElement<r*c;i--)
			{
				System.out.print(matrix[i][leftCol]+" ");
				totalElement++;
			}
			leftCol++;
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
		
		System.out.println("Spiral Order");
		printSpiralOrder(matrix,r,c);

	}

}
