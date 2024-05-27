package Arrays;

import java.util.Scanner;

public class Array4c {
	
	static int[] makeFrequencyArray(int [] arr)
	{
		int [] freq=new int[100005];
		for(int i=0;i<arr.length;i++)
		{
			freq[arr[i]]++;
		}
		return freq;
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
		int [] freq= makeFrequencyArray(arr);
		System.out.println("enter no of queries");
		int q=sc.nextInt();
		
		while(q>0)
		{
			System.out.println("Enter the number to be searched");
			int x=sc.nextInt();
			if(freq[x]>0)
			{
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			q--;
		}
	}

}
