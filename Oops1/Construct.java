package Oops1;
class Alge{
	int a,b;
	Alge(int x,int y)
	{
		a=x;
		b=y;
	}
	int add()
	{
		return a+b;
	}
	int sub()
	{
		return a-b;
	}
	int mul()
	{
		return a*b;
	}
}
public class Construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alge obj=new Alge(10,20);
		System.out.println(obj.add());
		System.out.println(obj.sub());
		System.out.println(obj.mul());

	}

}
