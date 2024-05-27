package Recursion;

import java.util.Scanner;

public class StringPelindrome10c {
	
	static boolean isPelindrome(String s,int l ,int r)
	{
		if(l>=r) return true;
		return(s.charAt(l)==s.charAt(r)&& isPelindrome(s,l+1,r-1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(isPelindrome(s,0,s.length()-1));

	}

}
