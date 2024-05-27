package Arrays;
import java.util.*;
public class Array5 {
	
	static void swap(int[]arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void printArray(int[]arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
//	static void sortZeroandOnes(int[] arr)
//	{
//		int n=arr.length;
//		int zeros=0;
//		for(int i=0;i<n;i++)
//		{
//			if(arr[i]==0)
//			{
//				zeros++;
//			}
//		}
//		for(int i=0;i<n;i++)
//		{
//			if(i<zeros)
//			{
//				arr[i]=0;
//			}
//			else {
//				arr[i]=1;
//			}
//		}
//	}
	
	static void sortZeroandOnes(int[] arr)
	{
		int n=arr.length;
		int left=0,right=n-1;
		while(left<right)
		{
			if(arr[left]==1 && arr[right]==0)
			{
				swap(arr , left,right);
				left++;
				right--;
			}
			if(arr[left]==0)
			{
				left++;
			}
			if(arr[right]==1)
			{
				right--;
			}
		}
	}
	
	static void sortArrayByParity(int[]arr)
	{
		int n=arr.length;
		int left=0,right=n-1;
		while(left<right)
		{
			if(arr[left] %2 == 1 && arr[right]%2==0)
			{
				swap(arr,left,right);
				left++;
				right--;
			}
			if(arr[left]%2==0)
			{
				left++;
			}
			if(arr[right]%2==1)
			{
				right--;
			}
		}
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
//		sortZeroandOnes(arr);
		sortArrayByParity(arr);
		System.out.println("Sorted array: ");
		printArray(arr);
	}

}
