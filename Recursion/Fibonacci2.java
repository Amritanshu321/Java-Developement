package Recursion;

public class Fibonacci2 {
	
	static int fib(int n)
	{
//		if(n==0)
//		{
//			return 0;
//		}
//		if(n==1)
//		{
//			return 1;
//		}
		// base case
		if(n==0||n==1)
		{
			return n;
		}
		// subproblem
//		int prev=fib(n-1);
//		int prevPrev=fib(n-2);
//		
//		// self work
//		return prev+prevPrev;
		return fib(n-1)+fib(n-2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=10;i++)
		{
			System.out.print(fib(i)+" ");
		}

	}

}
