package Arrays;
class ArrayExample{
	
	void multiArray() {
		int[][] arr1=new int[5][3];
		int [][] arr= {{56,43,6},{34,7,8},{12,56,8}};
		
//		int[][][] ar =new int[5][3][2];
//		ar[0][0][0]=1;
		
//		System.out.println(arr[0][0]);//56
//		System.out.println(arr[0][1]);//43
//		System.out.println(arr[0][2]);//6
//		
//		System.out.println(arr[1][0]);//34
//		System.out.println(arr[1][1]);//7
//		System.out.println(arr[1][2]);//8
//		
//		System.out.println(arr[2][0]);//12
//		System.out.println(arr[2][1]);//56
//		System.out.println(arr[2][2]);//8
		
		for(int i=0;i<arr.length;i++)
		{
			//arr[0] arr[1]
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
	void demoArray()
	{
		int [] age=new int[3];
		age[0]=34;
		age[1]=12;
		age[2]=45;
		//age[5]=23;  out of bound error
		
		String[] names= {"rahul","raj","Aradhya","vaishali"};
		
//		System.out.println(age.length);
//		System.out.println(names.length);
		
//		System.out.println(age[0]);
//		System.out.println(age[1]);
//		System.out.println(age[2]);
		
		//accessing through for loop
//		for(int i=0;i<3;i++)
//		{
//			System.out.println(age[i]);
//		}
		
		//accessing through for each loop
//		for(int ages:age) {
//			System.out.println(ages);
//		}
		
		//accessing through while loop
		int i=0;
		while(i<3)
		{
			System.out.println(age[i]);
			i=i+1;
		}
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
	}
}
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayExample obj = new ArrayExample();
//		obj.demoArray();
		obj.multiArray();

	}

}
