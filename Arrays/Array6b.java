package Arrays;

import java.util.Scanner;

public class Array6b {
	
	static void printArray(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static int[] makePrefixSumArray(int[]arr)
	{
		int n=arr.length;
		int[] pref=new int[n];
		pref[0]=arr[0];
		for(int i=1;i<n;i++)
		{
			pref[i]=pref[i-1]+arr[i];
		}
		return pref;
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
		int[]prefSum=makePrefixSumArray(arr);
		System.out.println("enter number of querries");
		int q=sc.nextInt();
		while(q-->0)
		{
			System.out.println("enter range");
			int l=sc.nextInt();
			int r=sc.nextInt();
			int ans=prefSum[r]-prefSum[l-1];
			System.out.println("sum "+ans);
		}

	}

}
