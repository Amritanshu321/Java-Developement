package Recursion;

import java.util.Scanner;

public class Gcd7 {
	
	static int minimum(int x,int y)
	{
		if(x<y) {
			return x;
		}
		else {
			return y;
		}
	}
	
	static void gcd(int x,int y)
	{
		int min= minimum(x,y);
		for(int i=min;i>=1;i--)
		{
			if(x%i==0 && y%i==0)
			{
				System.out.println(i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		gcd(x,y);

	}

}
