package basicsjava;
import java.util.Scanner;
public class Inputtaking {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Radius");
		int radius=sc.nextInt();
		double pi=3.1415;
		double area=pi*radius*radius;
		System.out.println("The area of circle is "+area);
		// TODO Auto-generated method stub

	}

}
