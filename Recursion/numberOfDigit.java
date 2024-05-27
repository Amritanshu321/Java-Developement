package Recursion;

public class numberOfDigit {
	
	static int nod(int n)
	{
		if(n>=0 && n<=9)
		{
			return 1;
		}
		return nod(n/10)+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(nod(12345678));

	}

}
