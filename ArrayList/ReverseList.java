package ArrayList;
import java.util.Collections;
import java.util.ArrayList;

public class ReverseList {
	
	static void reverseList(ArrayList<Integer> list)
	{
		int i=0,j=list.size()-1;
		while(i<j)
		{
			Integer temp=Integer.valueOf(list.get(i));
			list.set(i,list.get(j));
			list.set(j, temp);
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.add(0);
		list.add(10);
		list.add(3);
		list.add(5);
		list.add(22);
		list.add(10);
		System.out.println("original list"+list);
//		reverseList(list);
		Collections.reverse(list);
		System.out.println("Reversed list"+list);
		Collections.sort(list);
		System.out.println("Acceding order "+list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Decending order"+list);
		
		ArrayList<String> l1=new ArrayList<>();
		l1.add("Welcome");
		l1.add("To");
		l1.add("Physics");
		l1.add("Wallah");
		System.out.println("OG"+l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("Sorted"+l1);

	}

}
