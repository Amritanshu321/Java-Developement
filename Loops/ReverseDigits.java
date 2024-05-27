package Loops;
import java.util.*;
public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int ans=0;
		while(n>0)
		{
			ans=ans*10+(n%10);
			n=n/10;
			
		}
		System.out.println("reverse of digits "+ans);
		

	}

}
