package Recursion;

import java.util.Scanner;

public class SeriesSum6 {
	
	static int SeriesSum(int n)
	{
		if(n==0)return 0;
		if(n%2==0) {
			return SeriesSum(n-1)-n;
		}
		else {
			return SeriesSum(n-1)+n;
		}
	}
	
	static int SeriesSum1(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return SeriesSum1(n-1)+n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		System.out.println(SeriesSum1(n));
		System.out.println(SeriesSum(n));

	}

}
