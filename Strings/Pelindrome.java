package Strings;
import java.util.*;
public class Pelindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aba";
//		StringBuilder gtr=new StringBuilder(str);
//		gtr.reverse();
//		String s=gtr+"";
//		if(str.equals(s)) {
//			System.out.println("palindrome");
//		}else {
//			System.out.println("Not palindrome");
//		}
		
		//or
		int i=0;
		int j=str.length()-1;
		boolean flag = true;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				flag=false;
				break;
			}
			i++;
			j--;
		}
		if(flag==true)System.out.println("Palindrome");
		else System.out.println("Not Palindrome");

	}

}
