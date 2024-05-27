package Recursion;

import java.util.ArrayList;

public class StringReturnSSQ11 {
	
	static ArrayList<String> getSSQ(String s)
	{
		/*
		 * s="abc"
		 * */
		ArrayList<String> ans=new ArrayList<>();
		// base case
		if(s.length()==0)
		{
			ans.add("");
			return ans;
		}
		
		char curr=s.charAt(0);//a
		ArrayList<String> smallAns=getSSQ(s.substring(1));//["bc","b","c"," "]
		
		//small ans=["bc","b","c"," "]
		// ans=["bc","abc","b","ab","c","ac"," ","a"]
		
		for(String ss:smallAns)
		{
			ans.add(ss);
			ans.add(curr+ss);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ans=getSSQ("abc");
		for(String ss:ans)
		{
			System.out.println(ss);
		}

	}

}
