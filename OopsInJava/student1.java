package OopsInJava;

public class student1 {
	private int rno;
	String name;
	double percent;
	
	final String CollageName="IERT";
	
	static int noofStudent;
	//constructor 
	public student1() {//default constructor
		noofStudent++;
	}
	public student1(String nam,int rollno,double percentage) {
		name=nam;
		rno=rollno;
		percent=percentage;
		noofStudent++;
	}
	
	public int getRno() {//getter
		return rno;
	}
	public void setRno(int rno) {//setter
		this.rno=rno;
	}

}
