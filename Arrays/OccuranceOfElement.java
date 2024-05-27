package Arrays;
import java.util.*;
public class OccuranceOfElement {
	
	static int[] smallestAndLargestElement(int[] arr)
	{
		Arrays.sort(arr);
		int [] ans= {arr[0],arr[arr.length-1]};
		return ans;
	}
	
	static boolean isSorted(int[] arr)
	{
		boolean check=true;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1])
			{
				check=false;
				break;
			}
		}
		return check;
	}
	
	static int lastOccurance(int arr[],int x)
	{
		int lastIndex=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				lastIndex=i;
			}
		}
		return lastIndex;
	}
	static int  count(int[] arr,int x)
	{
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				count++;
			}
		}
		return count;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of array element");
		int n= sc.nextInt();
		int[] arr=new int[n];
		
		System.out.println("enter array element ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter x");
		int x=sc.nextInt();
		
//		System.out.println("count of "+x+"is "+ count(arr,x));
		
//		System.out.println("last occurance of "+x+"is "+ lastOccurance(arr,x));
		
//		System.out.println("Is Sorted:"+isSorted(arr));
		
		int [] ans=smallestAndLargestElement(arr);
		System.out.println("smallest:"+ans[0]);
		System.out.println("largest"+ans[1]);
		
		

	}

}
