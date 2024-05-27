package Loops;
import java.util.*;
public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int noofdigits=0;
		while(n>0)
		{
			n=n/10;
			noofdigits++;
			
		}
		System.out.println("number of digits "+noofdigits);

	}

}
