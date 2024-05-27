package Loops;
import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
//		int c=sc.nextInt();
		for(int i=1;i<=r;i++)//traversing over rows
		{
			for(int j=1;j<=r-i;j++)//print r-i spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=(2*i-1);k++)//print 2*i-1 stars
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
