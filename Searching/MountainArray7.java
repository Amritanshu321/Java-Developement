package Searching;

public class MountainArray7 {
	
	static int peakIndex(int[]a) {
		int st=0,end=a.length-1;
		int ans=-1;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(a[mid]<a[mid+1]) {
				ans=mid+1;
				st=mid+1;
			}else {
				end=mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,0};
		System.out.println(peakIndex(a));

	}

}
