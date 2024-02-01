package array;

import java.util.Arrays;

import java.util.Arrays;

public class Sort2DArray {

    public static void sort2DArray(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Flatten the matrix
        int[] flattenedArray = new int[rows * cols];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                flattenedArray[index++] = matrix[i][j];
            }
        }

        // Sort the flattened array
        //Arrays.sort(flattenedArray);
        int n= flattenedArray.length;
        for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-i-1;j++)
          {
        	  if(flattenedArray[j]>flattenedArray[j+1])
        	  {
        		  int temp=flattenedArray[j];
        		  flattenedArray[j]=flattenedArray[j+1];
        		  flattenedArray[j+1]=temp;
        	  }
          }
        }

        index = 0;

        // Reconstruct the sorted matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = flattenedArray[index++];
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {15, 4, 7},
            {1, 13, 8},
            {2, 91, 16}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        sort2DArray(matrix);

        System.out.println("\nSorted Matrix without Diagonal Traversal:");
        printMatrix(matrix);
    }
}
