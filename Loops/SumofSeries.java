package Loops;
import java.util.*;
public class SumofSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		s=1-2+3-4...n find the sum of series
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				ans-=i;
			}
			else {
				ans+=i;
			}
			
		}
		System.out.println(ans);

	}

}
