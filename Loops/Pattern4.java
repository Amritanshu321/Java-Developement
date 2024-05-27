package Loops;
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
//		int c=sc.nextInt();
//		for(int i=1;i<=r;i++)
//		{
//			for(int j=1;j<=r+1-i;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		for(int i=r;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
