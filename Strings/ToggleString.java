package Strings;

public class ToggleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="phySICS";
		System.out.println(str);
//		StringBuilder sb= new StringBuilder(str);
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
//				str.setCharAt(i,dh);
				str=str.substring(0,i)+dh+str.substring(i+1);
			}else {//small
				asci-=32;
				char dh=(char)asci;
//				str.setCharAt(i, dh);
				str=str.substring(0,i)+dh+str.substring(i+1);
			}
		}
		System.out.println(str);

	}

}
