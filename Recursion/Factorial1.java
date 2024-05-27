package Recursion;

public class Factorial1 {
	
	static int factorial(int n)
	{
		//  base case
		if(n==0)
		{
			return 1;
		}
		//smaller problem - recursive work
		int smallAns=factorial(n-1); // factorial(4)=24
		// big problem - self work
		int ans= n*smallAns; //n*factorial(n-1)
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factorial(4));

	}

}
