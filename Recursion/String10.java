package Recursion;
import java.util.*;
public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//		String s=sc.next();  //read only the word before space
		String s= sc.nextLine();
		System.out.println(s);
		System.out.println(s.charAt(2));
		
		
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		System.out.println();
		
		System.out.println(s.substring(2,5));

	}

}
