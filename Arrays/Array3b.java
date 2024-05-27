package Arrays;

import java.util.Scanner;

public class Array3b {
	
	static int firstRepeatingNumber(int [] arr)
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					return arr[i];
				}
			}
		}
		return -1;
	}
	
	static int findMax(int[] arr)
	{
		int mx=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>mx)
			{
				mx=arr[i];
			}
		}
		return mx;
	}
	static int findSecondMax(int[]arr)
	{
		int mx=findMax(arr);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==mx)
			{
				arr[i]=Integer.MIN_VALUE;
			}
		}
		int SecondMax=findMax(arr);
		return SecondMax;
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
//		System.out.println("enter target sum");
//		int target=sc.nextInt();
//		System.out.println("Second maximum element:"+findSecondMax(arr));
		System.out.println("first repeating number"+firstRepeatingNumber(arr));

	}

}
