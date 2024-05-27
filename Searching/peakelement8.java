package Searching;

public class peakelement8 {
	
	static int  findPeak(int[]a) {
		int n=a.length;
		int st=0,end=n-1;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if((mid==0||a[mid]>a[mid-1])&&(mid==n-1||a[mid]>a[mid+1])) return mid;
			if(a[mid]<a[mid+1]) {
				//uphill  accending
				st=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,1};
		System.out.println(findPeak(a));

	}

}
