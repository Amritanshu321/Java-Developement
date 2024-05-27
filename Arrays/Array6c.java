package Arrays;

import java.util.Scanner;

public class Array6c {
	
	static int findArraySum(int[] arr)
	{
		int totalSum=0;
		for(int i=0;i<arr.length;i++)
		{
			totalSum+=arr[i];
		}
		return totalSum;
	}
	
	static boolean equalSumPartition(int[]arr)
	{
		int totalSum=findArraySum(arr);
		int prefixSum=0;
		for(int i=0;i<arr.length;i++)
		{
			prefixSum+=arr[i];
			int suffixSum=totalSum-prefixSum;
			if(suffixSum==prefixSum)
			{
				return true;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of element");
		int n=sc.nextInt();
		int [] arr=new int [n+1];
		System.out.println("enter "+n +" array element");
		for(int i=1;i<=n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Equal sum partition posible : "+equalSumPartition(arr));

	}

}
