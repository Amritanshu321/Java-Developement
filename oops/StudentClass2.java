package oops;

public class StudentClass2 {
public static class student1{
	String name;
	int Rollno;
	int age;
}

	public static void main(String[] args) {
		 class Car{
			String name;
			String model;
		}
		Car c1=new Car();
		c1.name="Maruti";
		c1.model="x001";
		System.out.println(c1.name);
		
		student1 x=new student1();
		x.name="Ashu";
		x.Rollno=10;
		x.age=20;
		System.out.println(x.name);
		
		student1 y=new student1();
		y.name="Aman";
		y.Rollno=1;
		y.age=21;
		System.out.println(y.name);
		// TODO Auto-generated method stub

	}

}
