package Loops;
import java.util.*;
public class pattern12 {

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
			for(int k=1;k<=i;k++)//print 1to i
			{
				System.out.print(k);
			}
			for(int k=(i-1);k>=1;k--)//print i-1 to 1
			{
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
