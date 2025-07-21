# DSARepo

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr = {1,0,2,0,3,4,5};
      int index =0;
      for(int curr =0;curr<arr.length;curr++)
      {
          if(arr[curr]!=0)
           {
                arr[index] = arr[curr];
                  if(index!=curr)
                     arr[curr] =0;
               index++;
           }
              
      }
      
      
      
    //   while(index< arr.length)
    //   { 
    //       System.out.println(index);
    //       arr[index] =0;
    //       index++;
    //   }
      System.out.print(Arrays.toString(arr));
    }
}
2. [0, 0, 1, 2, 3, 4, 5]
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
       int[] arr = {1,0,2,0,3,4,5};
      int index =arr.length-1;
      for(int curr =arr.length-1;curr>=0;curr--)
      {
          if(arr[curr]!=0)
           {
                arr[index] = arr[curr];
                  if(index!=curr)
                     arr[curr] =0;
               index--;
           }
              
      }
      
      
      
    //   while(index< arr.length)
    //   { 
    //       System.out.println(index);
    //       arr[index] =0;
    //       index++;
    //   }
      System.out.print(Arrays.toString(arr));
    }
}
