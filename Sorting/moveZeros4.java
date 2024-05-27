package Sorting;

public class moveZeros4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {0,1,10,5,0,4};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]==0 && a[j+1]!=0) {
					//swap a[j] , a[j+1]
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		for(int val:a) {
			System.out.print(val+" ");
		}

	}

}
