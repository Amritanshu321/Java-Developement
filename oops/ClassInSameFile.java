package oops;

public class ClassInSameFile {

	public static void main(String[] args) {
		ClassInSameFile1 ob=new ClassInSameFile1();
		ob.name="Amrit";
		//ob.rno=10; //we can not access because variable is private 
		
		ob.percent=100;
		System.out.println(ob.name);
		System.out.println(ob.getRno());
		ob.setRno(10);
		
		// TODO Auto-generated method stub

	}

}
//we use getters and setters to use private variables 