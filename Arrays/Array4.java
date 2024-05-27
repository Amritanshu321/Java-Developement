package Arrays;

public class Array4 {
	
	
	static void swapInArray(int[] arr,int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void reverseArrayInplace(int [] arr)
	{
		int i=0,j=arr.length-1;
		while(i<j)
		{
			swapInArray(arr,i,j);
			i++;
			j--;
		}
	}
	
//	static int[] reverseArray(int[] arr)
//	{
//		int n=arr.length;
//		int ans[]=new int[n];
//		int j=0;
//		for(int i= n-1;i>=0;i--)
//		{
//			ans[j++]=arr[i];
//		}
//		return ans;
//	}
	
	static void swap(int a,int b)
	{
		int temp;
		System.out.println("original value before swap");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
//		temp=a;
//		a=b;
//		b=temp;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("original value after swap");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
	
	static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=9;
		int b=3;
		swap(a,b);
		int[] arr= {1,2,3,4,5};
//		int[] ans= reverseArray(arr);
     	reverseArrayInplace(arr);
		printArray(arr);
		
		
		

	}

}
