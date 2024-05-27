package Strings;
import java.util.*;
public class Builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("hello");
//		str.append("world");
		
		// hello--> Mello
//		str.setCharAt(0, 'M');
//		System.out.println(str);//Mello
//		
//		str.insert(2,'y');
//		System.out.println(str);//Meyllo
//		
//		str.deleteCharAt(0);
//		System.out.println(str);//eyllo
		
		StringBuilder sb=new StringBuilder("physics");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		sb.delete(2, 4);
		System.out.println(sb);
		

	}

}
