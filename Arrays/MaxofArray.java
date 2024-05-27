package Arrays;
class max{
	void checkmax() {
		int arr[]= {5,3,6,2,8,4};
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>ans)
			{
				ans=arr[i];
			}
		}
		System.out.println(ans);
	}
}
public class MaxofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max ob=new max();
		ob.checkmax();
		

	}

}
