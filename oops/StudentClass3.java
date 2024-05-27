package oops;

//import oops.StudentClass2.student1;

public class StudentClass3 {
	public static class student2{
		String name;
		int Rollno;
		int age;
	}
	
public static void fun1(student2 y) {
	System.out.println(y.age);
}
	public static void main(String[] args) {
		
		student2 x=new student2();
		x.name="Ashu";
		x.Rollno=10;
		x.age=20;
		System.out.println(x.name);
		fun1(x);
		// TODO Auto-generated method stub

	}

}
