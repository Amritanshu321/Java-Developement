package Strings;
import java.util.*;
public class Interning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello";
//		String x="Hello";
//		x="Mello";
//		System.out.println(s);
		
		// hello --> Heylo
		s=s.substring(0, 2)+'y'+s.substring(3);
		System.out.println(s);

	}

}
