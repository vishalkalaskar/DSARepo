package array;

public class QuickSort {
    public static void quicksort(int[] arr,int low,int high)
    {
    	if(low<high)
    	{
    		int pivotIndex=partition(arr,low,high);
    		quicksort(arr,low,pivotIndex-1);
    		quicksort(arr,pivotIndex+1,high);
    	}
    }
    public static int partition(int[] arr,int low,int high)
    {
    	int pivot=arr[high];
    	int i=low-1;
    	for(int j=low;j<high;j++)
    	{
    		if(arr[j]<pivot)
    		{
    			i++;
    			int temp=arr[i];
    			arr[i]=arr[j];
    			arr[j]=temp;
    			
    		}
    	}
    	int temp=arr[i+1];
    	arr[i+1]=arr[high];
    	arr[high]=temp;
    	
    	return i+1;
    }
    public static void printArray(int[] arr)
    {
    	for(int num:arr)
    	{
    		System.out.print(num+" ");
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,30,40,80,90};
		System.out.println("original arry");
		printArray(arr);
		int n=arr.length;
		quicksort(arr,0,n-1);
		System.out.println("after quick sort");
		printArray(arr);
		
		

	}

}
