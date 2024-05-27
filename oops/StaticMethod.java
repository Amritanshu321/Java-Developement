//Static variable or class variable
package oops;

public class StaticMethod {

	public static void main(String[] args) {
		Studenta ob1=new Studenta("Ankur",10,20.0);
		System.out.println(ob1.noOfStudent);
		Studenta ob2=new Studenta("Aditya",11,50.0);
		System.out.println(ob1.noOfStudent);
		Studenta ob3=new Studenta("Aman",12,60.0);
		System.out.println(ob1.noOfStudent);
		System.out.println(Studenta.getNumberOfStudents());
		//we can access static function without creating object we can access with classnamea
		// TODO Auto-generated method stub

	}

}
/*
 *noOfStudent variable is static means common to overall class it does  not depend only on one object 
 *it is common for all the object  */
 