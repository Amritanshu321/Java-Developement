package Searching;

public class Firstoccurance1 {
	
	static int firstOccurance(int[]a,int x) {
		int n=a.length;
		int st=0,end=n-1;
		int fo=-1;
		while(st<=end) {
			int mid=st+(end-st)/2;
			if(a[mid]==x) {
				fo=mid;
				end=mid-1;//used for first occurance
//				st=mid+1;  used for last occurance
			}else if(x<a[mid]) {
				end=mid-1;
			}
			else {
				st=mid+1;
			}
		}
		return fo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,5,5,5,6,2,4};
		int x=5;
		System.out.println(firstOccurance(a,x));

	}

}
