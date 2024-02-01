package array;

public class InsertionSort {
	
	public static void insertionsort(int[] arr)
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		
	}
	public static void printing(int[] a)
	{
		for(int num:a)
		{
			System.out.print(num+" ");
		}
		 System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {12,11,13,5,6};
		System.out.println("original Array : ");
		printing(array);
		
		insertionsort(array);
		
		System.out.println("insertion Array : ");
		printing(array);

	}

}
