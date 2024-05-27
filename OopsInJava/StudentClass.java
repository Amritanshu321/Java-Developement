package OopsInJava;

public class StudentClass {
	// creating a new data type
	public static class Student{
		String name;
		int rno;
		double percent;
	}
	public static class car{
		String name;
		String type;
		int price;
	}
	
	
	public static void main(String[]args) {
		
		car c1=new car();
		c1.name="alto";
		c1.price=400000;
		c1.type="hachback";
		
		Student x=new Student();
		x.name="Raghav";
		x.rno=76;
		x.percent=92.5;
		
		Student s=new Student();
		s.name="Ashu";
		s.percent=97.2;
		s.rno=3;
		
		System.out.println(x.name);
		
		
		
		
		
		
	}

}
