package Sorting;

public class LexicoSortString4a {
	
	static void sortFruits(String[]a)
	{
		int n=a.length;
		for(int i=0;i<n-1;i++)
		{
			int min_idx=i;
			for(int j=i+1;j<n;j++) {
				if(a[j].compareTo(a[min_idx])<0) {
					min_idx=j;
				}
			}
			//swap a[min_idx],a[i]
			String temp=a[i];
			a[i]=a[min_idx];
			a[min_idx]=temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] fruits= {"kiwi","apple","papaya","mango"};
		sortFruits(fruits);
		for(String val:fruits) {
			System.out.print(val+" ");
		}

	}

}
