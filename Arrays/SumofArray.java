package Arrays;
class sum{
	void add() {
		int arr[]= {1,4,5,6,1};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}
public class SumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum ob=new sum();
		ob.add();

	}

}
