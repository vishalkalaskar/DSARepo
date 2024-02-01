package array;

public class Array1 {

	    public static void rearrangeArray(int[] arr) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++)
	        {
	        	if(arr[i]>0 )
	        	{
	        		System.out.println("postive"+arr[i]);
	        	}
	        	else
	        	{
	        		System.out.println("negative"+arr[i]);
	        	}
	        }
	    }

	    public static void printArray(int[] arr) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};

	        System.out.println("Original array:");
	        printArray(arr);

	        rearrangeArray(arr);

	        System.out.println("Rearranged array:");
	        printArray(arr);
	    }
	}
