package Strings;
import java.util.*;
public class Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StringBuilder str= new StringBuilder(sc.nextLine());
		System.out.println(str);
		
		// toggle
		//PHysiCS-->phYSIcs
		for(int i=0;i<str.length();i++) {
			//P-> p
			//check->alphabet-small,capital
			boolean flag=true;//true-. capital
			char ch=str.charAt(i);
			if(ch==' ') continue;
			int asci=(int)ch;
			if(asci>=97) flag=false;//small
			if(flag==true) {//capital
				asci+=32;
				char dh=(char)asci;
				str.setCharAt(i,dh);
			}else {//small
				asci-=32;
				char dh=(char)asci;
				str.setCharAt(i, dh);
			}
		}
		System.out.println(str);

	}

}
