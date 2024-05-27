package ArrayList;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wrapper class
//		Integer i= new Integer(3);
		
//		Integer in=Integer.valueOf(3);
//		System.out.println(in);
//		Float f=Float.valueOf(4.5f);
//		System.out.println(f);
		
//		ArrayList<Integer> l1 =new ArrayList<Integer>();
		ArrayList<Integer> l1=new ArrayList<>();
//		ArrayList<Boolean> l2=new ArrayList<>();
//		ArrayList<Float> l3=new ArrayList<>();
		
		// add new element
		l1.add(5);//5
		l1.add(6);// 5 6
		l1.add(7);// 5 6 7
		l1.add(8);// 5 6 7 8
		
		// get an element at i index
		System.out.println(l1.get(1)); // 6
		
		// print with for loop
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));//5,6,7,8
		}
		
		// print array list directly
		System.out.println(l1); //[5,6,7,8]
		
		//adding some element at index i  
		
		l1.add(1,100);
		System.out.println(l1);//[5 100 6 7 8]
		
		// modifying element at index i
		l1.set(1,10); //[5 10 6 7 8]
		System.out.println(l1);
		
		// removing an element at index i
		
		l1.remove(1);
		System.out.println(l1); // [5 6 7 8]
		
		// removing an element e
		l1.remove(Integer.valueOf(7));
		System.out.println(l1); //[5 6 8]
		
		System.out.println(l1.remove(Integer.valueOf(15))); //false
		
		// checking if an element exist
		boolean ans= l1.contains(Integer.valueOf(6));
		System.out.println(ans); //true
		
		// if u don't specify wrapper class , you can put anything inside l
		ArrayList l= new ArrayList();
		l.add("pqres");
		l.add(1);
		l.add(true);
		System.out.println(l);
		
		

	}

}
