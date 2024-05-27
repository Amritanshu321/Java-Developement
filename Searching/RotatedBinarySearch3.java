package Searching;

public class RotatedBinarySearch3 {
	
	static int findMin(int[]a) {
		int n=a.length;
		int st=0,end=a.length-1;
		int ans=-1;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(a[mid]<=a[n-1]) {
				ans=mid;
				end=mid-1;
			}else {
				st=mid+1;
			}
		}return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {3,4,5,1,2};
		System.out.println(findMin(a));

	}

}
