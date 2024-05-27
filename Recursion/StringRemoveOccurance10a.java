package Recursion;

import java.util.Scanner;

public class StringRemoveOccurance10a {
	
	static String removeA2(String s)
	{
		if(s.length()==0) return "";
		String smallAns=removeA2(s.substring(1));
		char currChar=s.charAt(0);
		// self work
		if(currChar!='a')
		{
			return currChar +smallAns;
		}
		else {
			return smallAns;
		}
	}
	
	static String removeA(String s,int idx)
	{
		// base case
		if(idx==s.length())return "";
		
		//recursive work
		String smallAns= removeA(s,idx+1);
		
		char currChar=s.charAt(idx);
		// self work
		if(currChar!='a')
		{
			return currChar +smallAns;
		}
		else {
			return smallAns;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(removeA(s,0));
		System.out.println(removeA2(s));

	}

}
