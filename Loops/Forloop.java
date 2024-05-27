package Loops;
import java.util.*;
public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int num=1;num<=n;num++)//all the three fields are optinal
		{
//			System.out.println(num);
			sum=sum+num;
		}
		System.out.println(sum);

	}

}
