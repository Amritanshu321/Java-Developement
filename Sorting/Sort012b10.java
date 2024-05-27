package Sorting;

public class Sort012b10 {
	
	static void display(int[]num) {
		for(int val:num) {
			System.out.print(val+" ");
		}
		System.out.println();
	}
	
	static void sort012(int[]num) {
		int count_0=0,count_1=0,count_2=0;
		for(int j:num) {
			if(j==0) {
				count_0++;
			}else if(j==1) {
				count_1++;
			}else {
				count_2++;
			}
		}
		int k=0;
		while(count_0>0) {
			num[k++]=0;
			count_0--;
		}
		while(count_1>0) {
			num[k++]=1;
			count_1--;
		}
		while(count_2>0) {
			num[k++]=2;
			count_2--;
		}
	}

	static void swap(int[]a,int x,int y) {
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}
	static void Sort012(int[]a) {
		int lo=0,mid=0,hi=a.length-1;
		//explore the unknown region
		while(mid<=hi) {
			if(a[mid]==0)
			{
				swap(a,mid,lo);
				mid++;
				lo++;
			}
			else if(a[mid]==1) {
				mid++;
			}else {
				swap(a,mid,hi);
				hi--;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]num2= {2,2,1,2,2,0,1,0,2,0};
		Sort012(num2);
		display(num2);

	}

}
