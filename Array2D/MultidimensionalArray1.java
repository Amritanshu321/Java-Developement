package Array2D;

import java.util.Scanner;

public class MultidimensionalArray1 {
	
	static void printArray(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)//row
		{
			for(int j=0;j<arr[i].length;j++)//column
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int r=sc.nextInt();
		System.out.println("enter no of columns");
		int c= sc.nextInt();
		
		int [][] arr=new int [r][c];
//		arr[0][0]=1;
//		arr[0][1]=2;
		System.out.println("enter "+r*c+" array element :");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
//		int [][] arr2= {
//				{1,5,6},
//				{7,9,11},
//				{8,1,1}
//		        };
		printArray(arr);

	}

}
