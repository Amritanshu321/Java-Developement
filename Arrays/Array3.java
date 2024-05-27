package Arrays;
import java.util.*;
public class Array3 {
	static int findUnique(int[]arr)
	{
		int n=arr.length;
		int ans=-1;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				ans=arr[i];
			}
		}
		
		return ans;
	}
	static int pairSum(int[] arr,int target)
	{
		int n=arr.length;
		int ans=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					ans++;
				}
			}
		}
		return ans;
	}
	static int tripletSum(int[] arr,int target)
	{
		int ans=0;
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==target)
					{
						ans++;
					}
				}
			}
		}
		return ans;
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
		System.out.println("enter target sum");
		int target=sc.nextInt();
//		System.out.println(pairSum(arr,target));
//		System.out.println(tripletSum(arr,target));
		System.out.println(findUnique(arr));

	}

}
