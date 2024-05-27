package Arrays;
import java.util.*;
class TakeInput
{
	void PrintArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of array element");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("enter"+n+"array element");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("original array");
		PrintArray(arr);
		
		// array referance 
		int[] arr2=arr; //trying to copy arr to arr2   shallow copy
		
		//deep copy
//		int [] arr2=arr.clone();

		 // other method
//		int [] arr2= Arrays.copyOf(arr, arr.length);
		 
//		int [] arr2= Arrays.copyOfRange(arr, 0, arr.length);
		
		System.out.println("copied array");
		PrintArray(arr2);
		// changing some value of arr2
		arr2[0]=0;
		arr2[1]=0;
		System.out.println("original array after changing arr2");
		PrintArray(arr);
		System.out.println("copied arr2 after changing arr2");
		PrintArray(arr2);
		
	}
}
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TakeInput tk=new TakeInput();
		tk.input();

	}

}
