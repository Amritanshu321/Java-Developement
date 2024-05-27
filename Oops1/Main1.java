package Oops1;
import java.util.*;
class Algebra{
	int add(int a,int b)
	{
		int ans=a+b;
		return ans;
	}
}
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("sum of number is");
		Algebra obj=new Algebra();
		int ans=obj.add(x, y);
		System.out.println(ans);

	}

}
