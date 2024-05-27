package Recursion;

public class ArraySearch9 {
	
	static boolean search(int[]a,int n,int target,int idx)
	{
		// base case
		if(idx>=n)
		{
			return false;
		}
		// self work
		if(a[idx]==target)
		{
			return true;
		}
		// recursivr work
		return search(a,n,target,idx+1);
	}
	
	static int findIndex(int[]a,int n,int target,int idx)
	{
		//return index of target if target present in array otherwise return -1
		// base case
		if(idx>=n)
		{
			return -1;
		}
		// self work
		if(a[idx]==target)
		{
			return idx;
		}
		// recursivr work
		return findIndex(a,n,target,idx+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,4,6};
		int target=4;
		int n=a.length;
		System.out.println(findIndex(a,n,target,0));
//		if(search(a,a.length,target,0))
//		{
//			System.out.println("Yes");
//		}
//		else
//		{
//			System.out.println("No");
//		}

	}

}
