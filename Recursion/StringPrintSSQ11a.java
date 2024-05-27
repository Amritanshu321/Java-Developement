package Recursion;

public class StringPrintSSQ11a {
	
	static void printSSQ(String s,String currAns) // s="abc",currAns=""
	{
		if(s.length()==0)
		{
			System.out.println(currAns);
			return;
		}
		char curr=s.charAt(0);//a
		String remString =s.substring(1);//bc
		
		// curr char-> chooses to be a part of currAns
		printSSQ(remString,currAns+curr);// (bc , a)
		
		// curr char-> doesnot choose to be a part of currAns
		printSSQ(remString, currAns);// (bc,"")
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSSQ("abc","");

	}

}
