package Loops;
import java.util.*;
public class CountDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int noofdigits=0;
		int sumofdigits=0;
		while(n>0)
		{
			sumofdigits +=n%10;
			n=n/10;
			noofdigits++;
			
		}
		System.out.println("number of digits "+noofdigits);
		System.out.println("digitsum= "+sumofdigits);

	}

}
