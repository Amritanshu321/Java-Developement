package Strings;
import java.util.*;
public class PrintAllSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcd";
		for(int i=0;i<=3;i++) {
			for(int j=i+1;j<=4;j++) {
				System.out.print(str.substring(i,j)+" ");
			}
		}

	}

}
