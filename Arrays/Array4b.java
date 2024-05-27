package Arrays;

import java.util.Scanner;

public class Array4b {
	
	static void swap(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void reverse(int[] arr,int i,int j)
	{
		while(i<j)
		{
			swap(arr,i,j);
			i++;
			j--;
		}
	}
	
	static void rotateInPlace(int[] arr,int k)
	{
		int n=arr.length;
		k=k%n;
		reverse(arr,0,n-k-1);
		reverse(arr,n-k,n-1);
		reverse(arr,0,n-1);
	}
	
	static int[] rotate(int[]arr,int k)
	{
		int n=arr.length;
		k=k%n;
		int[] ans=new int[n];
		int j=0;
		for(int i=n-k;i<n;i++)
		{
			ans[j++]=arr[i];
		}
		for(int i=0;i<n-k;i++)
		{
			ans[j++]=arr[i];
		}
		return ans;
	}
	
	static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numer of element");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter k : ");
		int k=sc.nextInt();
		System.out.println("original array: ");
		printArray(arr);
//		int[]ans=rotate(arr,k);
		rotateInPlace(arr,k);
		System.out.println("after Rotate :");
//		printArray(ans);
		printArray(arr);
	}

}
