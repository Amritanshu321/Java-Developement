package basicjava1;
import java.util.*;
public class SimpleIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter principle");
		float p=sc.nextFloat();
		
		System.out.println("enter rate of intrest");
		float r=sc.nextFloat();
		
		System.out.println("enter time");
		float t=sc.nextFloat();
		
		float si=(p*r*t)/100;
		
		System.out.println("principle= "+p);
		System.out.println("rate= "+r);
		System.out.println("Time= "+t);
		
		System.out.println("Simple Intrest= "+si);
		
		

	}

}
