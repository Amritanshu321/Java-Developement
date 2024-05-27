package Sorting;

public class BubbleSort1 {
	
	static void bubbleSort(int[]a) {
		int n=a.length;
		//n-1 iterations/pass
		for(int i=0;i<n-1;i++)
		{
			boolean flag=false; //has any swap happened
			for(int j=0;j<n-i-1;j++) {
				// last i element are already at correct sorted position
				//so no need to check them
				if(a[j]>a[j+1])
				{
					// swap a[j],a[j+1]
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flag=true; //some swap happened
				}
			}
			if(flag==false) {//have any swaps happened?
				return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {7,6,5,4,3};
		bubbleSort(a);
		for(int i:a)
		{
			System.out.print (i+" ");
		}

	}

}
