package Arrays;

import java.util.Scanner;

public class Array6 {
	
	static void printArray(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
//	static int[] makePrefixSumArray(int[]arr)
//	{
//		int n=arr.length;
//		int[] pref=new int[n];
//		pref[0]=arr[0];
//		for(int i=1;i<n;i++)
//		{
//			pref[i]=pref[i-1]+arr[i];
//		}
//		return pref;
//	}
	
	static int[] makePrefixSumArray(int[]arr)
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			arr[i]=arr[i-1]+arr[i];
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of element");
		int n=sc.nextInt();
		int [] arr=new int [n];
		System.out.println("enter "+n +" array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("original array : ");
		printArray(arr);
		
		int[]pref= makePrefixSumArray(arr);
		printArray(pref);

	}

}
