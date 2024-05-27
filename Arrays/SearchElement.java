package Arrays;
class Search{
	void searchindex() {
		int arr[]= {10,5,3,6,2,8,4};
		int x=2;
		int ans=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
			{
				ans=i;
				break;
			}
		}
		if(ans==-1)
		{
			System.out.println("Not found");
		}
		else
			System.out.println("Found "+x+"at index "+ans);
	}
}

public class SearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Search ob=new Search();
		ob.searchindex();

	}

}
