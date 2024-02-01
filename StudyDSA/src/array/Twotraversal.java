package array;

public class Twotraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		 
		 int[][] arr = {
	                {1, 2, 3, 4},
	                {5, 6, 7, 8},
	                {9, 10, 11, 12},
	                {13, 14, 15, 16}
	        };

		/*
		 * for(int i=0;i<arr.length;i++) { for(int j=0;j<arr[i].length;j++) {
		 * System.out.print(arr[i][j]); if(i!= arr.length-1 || j !=arr[i].length-1) {
		 * System.out.print(","); } } }
		 */

		
		  for(int j=0;j<arr[0].length;j++) 
		  { 
			  for(int i=arr.length-1;i>=0;i--) 
			  {
		             System.out.print(arr[i][j]+" ");
		       } 
			  System.out.println();
			  
		  }
		 

	}

}
