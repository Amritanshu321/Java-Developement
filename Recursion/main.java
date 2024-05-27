package Recursion;
import java.util.*;
public class main {
	
	static void printDecreasing(int n) // 5   4 3 2 1
	{
		// base case
		if(n==1)
		{
			System.out.println(1);
			return;
		}
		// self work , recursive work
		System.out.println(n); // n
		printDecreasing(n-1); // n-1 , n-2 , ..... 1
	}
	
	static void printIncreasing(int n)
	{
		// base case
		if(n==1)
		{
			System.out.println(n);
			return;
		}
		// recursive work 
		printIncreasing(n-1); //1 2 3 4 ... n-1
		// self work 
		System.out.println(n);//n 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		printIncreasing(n);
		printDecreasing(n);

	}

}
