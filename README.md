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

3.cheking sorted and not Aseceding and descending 
class Main {
    public static void main(String[] args) {
       int[] arr = {1,1,2,3,4,5,6,7,8};
       Boolean value=true;
       for(int i=0;i<arr.length-1;i++)
       {
           if(arr[i]>arr[i+1])   // if(arr[i]<arr[i+1])
           {
              value=false;            
           }
       }
       if(value)
           System.out.println("give arrays is acesding "+value);
       else
          System.out.println("not sorted"+value);
    //  System.out.print(Arrays.toString(arr));
    }

**sliding window approach**

class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int sum=0;
        for(int i=0;i<arr.length-3;i++)
        {
            for(int k=i;k<i+3;k++)
            {
                 System.out.println(arr[k]+" ");
                 sum+=arr[k];
            }
            System.out.println(); // new line after each group
            System.out.println("sum is "+sum);
            
          
        }
    }
}

ALETERNATIVE 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int sum=0;
        int i=0;
        int j=0;
        int k=3;
         int maxsum = Integer.MIN_VALUE;  // Fix here
        while(j<arr.length)
        {
            sum+=arr[j];
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                maxsum= Math.max(maxsum,sum);
                sum-=arr[i];
                i++;
                j++;
            }
        }
        System.out.println("maxsum "+maxsum);
        
        
    }
}

    
