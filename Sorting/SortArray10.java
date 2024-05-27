package Sorting;

public class SortArray10 {
	
	static void display(int[]num) {
		for(int val:num) {
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
	static void sortArray(int[]num) {
		int n=num.length;
		int x=-1,y=-1;
		if(n<=1) {//corner case
			return;
		}
		// process all adjcent element
		for(int i=1;i<n;i++) {
			if(num[i-1]>num[i]) {
				if(x==-1) {//first conflict
					x=i-1;
					y=i;
				}else {// 2nd conflict
					y=i;
				}
			}
		}
		//swap x and y in num
		int temp=num[x];
		num[x]=num[y];
		num[y]=temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []num= {10,5,6,7,8,9,3};
		sortArray(num);
		display(num);
		

	}

}
