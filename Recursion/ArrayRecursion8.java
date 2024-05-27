package Recursion;

public class ArrayRecursion8 {
	
	static int maxInArray(int [] arr ,int idx)
	{
		// base case
		if(idx==arr.length-1)
		{
			return arr[idx];
		}
		// small problem-   idx+1 ,end of array -> max -> recursive
		int smallAns=maxInArray(arr,idx+1);
		
		// self work
		
		return Math.max(arr[idx],smallAns);
	}
	
	static void printArray(int[] arr ,int idx) // 5 6 7 8
	{
		// base case
		if(idx==arr.length)
		{
			return;
		}
		// self work
		System.out.println(arr[idx]); // 5
		// recursive work
		printArray(arr,idx+1); // 6 7 8
	}
	
	static int arraySum(int[]arr,int idx)
	{
		// base case 
		if(idx== arr.length-1)
		{
			return arr[idx];
		}
		// recursive work
		int samllans= arraySum(arr,idx+1);
		// self work
		return samllans+arr[idx];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,6,7,8,9};
//		printArray(arr,0);
		
//		System.out.println(maxInArray(arr,0));
		System.out.println(arraySum(arr,0));

	}

}
