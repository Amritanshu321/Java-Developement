package oops;

//import oops.StudentClass3.student2;

public class StudentClass4 {
/*
public static void change(int x)
{
	x=7;
	}
	*/
	public static class student3{
		String name;
		int Rollno;
		int age;
	}
	public static void change(student3 s) {
		s.name="Rohan";
	}

	public static void main(String[] args) {
		/*
		int x=5;
		System.out.println(x);
		change(x);
		System.out.println(x);
		*/
		student3 x=new student3();
		x.name="Ashu";
		x.Rollno=10;
		x.age=20;
		System.out.println(x.name);
		change(x);
		System.out.println(x.name);
		// TODO Auto-generated method stub

	}

}
