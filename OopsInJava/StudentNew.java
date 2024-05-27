package OopsInJava;
public class StudentNew {
	
//	public static class student1{
//		int rno;
//		String name;
//		double percent;
//	}
	
	public static  void studentinfo(student1 x) {
		//it is not posible when the class is decleared inside main
		
		// if the class is decleared outside main then we can ccess it
		System.out.println(x.name);
		System.out.println(x.percent);
//		System.out.println(x.rno);
		
	}
	
//	public static void change(int x) {
//		x=7;
//		return;
//	}
	
	public static void change(student1 ss) {
		ss.name="Rohan";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		class student1{
//			int rno;
//			String name;
//			double percent;
//		}
		
//		student1 s=new student1();
//		s.name="Aman";
//		s.percent=75;
//		s.rno=2;
//		studentinfo(s);
//		System.out.println(s.name);
//		s.name="Rahul";
//		System.out.println(s.name);
		
//		int x=5;
//		System.out.println(x);
//		change(x);
//		System.out.println(x);
		
//		System.out.println(s.name);
//		change(s);
//		System.out.println(s.name);
//		
//		//getter and setter
//		
//		System.out.println(s.getRno());
//		
//		s.setRno(76);
//		System.out.println(s.getRno());
		
		System.out.println(student1.noofStudent);
		//constructor
		student1 st1=new student1();
		st1.name="Aman";
		st1.percent=88.6;
		st1.setRno(12);
//		System.out.println(st1.CollageName);
		System.out.println(st1.noofStudent);
		
		student1 st=new student1("raghav",76,92.1);
//		System.out.println(st.name);
//		System.out.println(st.getRno());
//		System.out.println(st.percent);
		System.out.println(st.noofStudent);
		

	}

}
