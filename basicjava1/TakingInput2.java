package basicjava1;
import java.util.Scanner;
public class TakingInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("Enter your uckey no");
      	int num1=sc.nextInt();
	    System.out.println("your luckey no is "+num1);
		*/
		System.out.println("enter your name");
//		String name=sc.next();
		String name=sc.nextLine();
		System.out.println("Your name is "+name);
		

	}

}
