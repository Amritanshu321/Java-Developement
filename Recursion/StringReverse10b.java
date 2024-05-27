package Recursion;

import java.util.Scanner;

public class StringReverse10b {
	
	static String reverse(String s,int idx)
	{
		if(idx==s.length()) return "";
		String smallAns=reverse(s,idx+1);
		return smallAns+s.charAt(idx);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(reverse(s,0));
		String rev=reverse(s,0);
		if(rev.equals(s)) {
			System.out.printf("%s is Palindrome",s);
		}else {
			System.out.printf("%s is Not Palindrome",s);
		}

	}

}
