package Recursion;
import java.util.*;
public class ArraySearch9a {
	
	static void searchArray(int []a,int x,int idx)
	{
		int n=a.length;
		// base case
		if(idx>=n)
		{
			return;
		}
		// self work
		if(a[idx]==x)
		{
			System.out.print(idx+" ");
		}
		// recursive work
		searchArray(a,x,idx+1);
	}
	
	static ArrayList<Integer> allIndices(int[]a,int n,int target,int idx)
	{
		// base case 
		if(idx>=n)
		{
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> ans=new ArrayList<>();
		
		// selfWork
		if(a[idx]==target) {
			ans.add(idx);
		}
		// recursive work
		ArrayList<Integer> smallAns =allIndices(a,n,target,idx+1);
		ans.addAll(smallAns);
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,3,2,2,1,4};
		int x=2;
//		searchArray(a,x,0);
		int target=2;
		int n= a.length;
		ArrayList<Integer> ans=allIndices(a,n,target,0);
		for(Integer i:ans)
		{
			System.out.println(i);
		}
		

	}

}
