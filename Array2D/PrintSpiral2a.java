package Array2D;

import java.util.Scanner;

public class PrintSpiral2a {
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
	
	static int[][] generateSpiralMatrix(int n)
	{
		int [][]matrix=new int[n][n];
		int topRow=0,bottomRow=n-1,leftCol=0,rightCol=n-1;
		int curr=1;
		while(curr<=n*n)
		{
			//top row->leftcol to rightcol
			for(int j=leftCol;j<=rightCol && curr<=n*n;j++)
			{
				matrix[topRow][j]=curr++;
			}
			topRow++;
			
			//rightcol-> topRow to BottomRow
			for(int i=topRow;i<=bottomRow && curr<n*n;i++)
			{
				matrix[i][rightCol]=curr++;
			
			}
			rightCol--;
			
			//bottomRow ->rightcol to leftcol
			for(int j=rightCol;j>=leftCol && curr<n*n;j--)
			{
				matrix[bottomRow][j]=curr++;
			}
			bottomRow--;
			
			//leftcol->bottomRom to topRow
			for(int i=bottomRow;i>=topRow && curr<n*n;i--)
			{
				matrix[i][leftCol]=curr++;
			}
			leftCol++;
		}
		return matrix;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ennter n");
		int n=sc.nextInt();
		int[][]matrix=generateSpiralMatrix(n);
		printMatrix(matrix);

	}

}
