package Recursion;

public class SubsetSum11b {
	
	static void subsetSum(int[]a,int n,int idx,int sum)
	{
		if(idx>=n)
		{
			System.out.println(sum);
			return;
		}
		// curr idx +curr ans
		subsetSum(a,n,idx+1,sum+a[idx]); //include
		
		//curr ans
		subsetSum(a,n,idx+1,sum);//exclude
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,5};
		subsetSum(a,a.length,0,0);

	}

}
