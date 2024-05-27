package oops;
class Student{
	String name;
	int rno;
	double percent;
}
public class StudentClass {
	//creating a new data type
	
	/*public static class Car
	{
		String name;
		String type;
		int price;
		}*/

	public static void main(String[] args) {
		
		Student x= new Student();
		x.name="Raghav";
		x.rno=76;
		x.percent=92.5;
		System.out.println(x.name);
		System.out.println(x.rno);
		System.out.println(x.percent);
		/*
		Student y= new Student();
		y.name="Ashu";
		y.rno=3;
		y.percent=97.2;
		*/
		// TODO Auto-generated method stub

	}

}
