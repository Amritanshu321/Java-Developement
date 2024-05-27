package Loops;

public class MultipleOf5and7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		while(true) {
			if(num%5==0 && num%7==0)
			{
				System.out.println("found ans "+num);
				break;
			}
			num++;
		}

	}

}
