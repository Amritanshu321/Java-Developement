package oops;

public class Studenta {
	String name;
	int rollno;
	double percentage;
	final String schoolName="BBPS";
	static int noOfStudent;        //Static variable
	//final value can not be changed
	
public Studenta() {
		//Default construstor
}
public Studenta(String nam,int rool, Double percent)//parametarized constructor 
{
	name=nam;
	rollno=rool;
	percentage=percent;
	noOfStudent++;
	}
public static int getNumberOfStudents() {//Static method
	return noOfStudent;
}
}
