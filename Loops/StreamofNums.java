package Loops;
import java.util.*;
public class StreamofNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num!=-1)
		{
			sum=sum+num;
			num=sc.nextInt();
		}
		System.out.println(sum);

	}

}
