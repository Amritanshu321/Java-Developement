package Conditionals;
import java.util.*;
public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
//		if(num%2==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
		String ans=(num%2==0)?"even":"odd";
		System.out.println(ans);

	}

}
