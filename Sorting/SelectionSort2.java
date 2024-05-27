package Sorting;

public class SelectionSort2 {
	
	static void selectionSort(int[]arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {//i represent current index
			
			//find minimum element in unsorted part of array
			int min_index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index=j;
				}
			}
			//swap current element and min element -> currnt element i will have correct element
			//arr[min_index],arr[i]
			int temp=arr[i];
			arr[i]=arr[min_index];
			arr[min_index]=temp;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {7,4,5,1,2};
		selectionSort(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}

	}

}
