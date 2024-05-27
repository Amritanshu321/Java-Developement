package Recursion;

public class Power4 {
	
	static int pow(int p, int q)
	{
		//ase case
		if(q==0)
		{
			return 1;
		}
		// recursive work
		int smallAns= pow(p,q-1);
		return smallAns*p;
	}
	
	static int power(int p,int q)
	{
		if(q==0) return 1;
		int smallPow=power(p,q/2);
		if(q%2==0)
		{
			return smallPow*smallPow;
		}
		else {
			return p*smallPow*smallPow;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(pow(5,4));
		System.out.println(power(5,4));

	}

}
