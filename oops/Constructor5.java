package oops;

public class Constructor5 {

	public static void main(String[] args) {
		Studenta stt=new Studenta();
		stt.name="Amrit";
		stt.rollno=15;
		stt.percentage=96.0;
		System.out.println(stt.schoolName);
		System.out.println(stt.name);
		System.out.println(stt.rollno);
		System.out.println(stt.percentage);
		
		Studenta st=new Studenta("Ashu",20,70.5);
		System.out.println(st.name);
		System.out.println(st.rollno);
		System.out.println(st.percentage);
		st.percentage=90;
		// TODO Auto-generated method stub

	}

}
