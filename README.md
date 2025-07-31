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

4. first -ve negative number of every sliding window
   // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr = {12,-1,-7,8,-15,30,16,28};
        int i=0;
        int j=0;
        int k=3;
   //LinkedHashSet<Integer> set = new LinkedHashSet<>(); to achive this LinkedHashSet<Integer> set = new LinkedHashSet<>();
        List<Integer> list = new ArrayList<>();
        while(j<arr.length)
        {
            if(j-i+1<k)
            {
                j++;
            }
            else if(j-i+1==k)
            {
                boolean found=false;
                for(int x=i;x<j;x++)
                { 
                    if(arr[x]<0)
                    {
                        list.add(arr[x]);
                        found=true;
                         break; // only first negative needed
                    }
                    
                }
                if (!found) {
                    list.add(0);                 // no negative found
                }
               i++; 
               j++;
            }
           
        }
        System.out.println("List of  first negetive number "+list);
        
        
    }
}

5.count occurancess of anagram.
class Main {
    public static void main(String[] args) {
        String s = "xxorfxaofr";
        int i = 0, j = 0;
        int k = 3;  // window size

        while (j < s.length()) {
            if (j - i + 1 < k) {
                j++;
            } else if (j - i + 1 == k) {
                boolean hasF = false, hasO = false, hasR = false;

                // check current window [i, j]
                for (int x = i; x <= j; x++) {
                    if (s.charAt(x) == 'f') hasF = true;
                    if (s.charAt(x) == 'o') hasO = true;
                    if (s.charAt(x) == 'r') hasR = true;
                }

                if (hasF && hasO && hasR) {
                    System.out.println("Window contains f,o,r: " + s.substring(i, j + 1));
                }

                // slide window
                i++;
                j++;
            }
        }
    }
}
//alernative code
import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "xxorfxaofr";
        String pattern = "for";
        int k = pattern.length();
        
        // Frequency map for pattern
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Sliding window frequency map
        Map<Character, Integer> windowMap = new HashMap<>();
        int i = 0, j = 0, count = 0;

        while (j < s.length()) {
            // Add current character to window map
            char curr = s.charAt(j);
            windowMap.put(curr, windowMap.getOrDefault(curr, 0) + 1);

            // If window size < k, just expand
            if (j - i + 1 < k) {
                j++;
            } 
            // When window size == k
            else if (j - i + 1 == k) {
                // Check if maps match (anagram found)
                if (windowMap.equals(freqMap)) {
                    count++;
                    System.out.println("Anagram found: " + s.substring(i, j + 1));
                }

                // Remove leftmost char from window
                char left = s.charAt(i);
                windowMap.put(left, windowMap.get(left) - 1);
                if (windowMap.get(left) == 0) {
                    windowMap.remove(left);
                }

                // Slide the window
                i++;
                j++;
            }
        }

        System.out.println("Total anagram occurrences: " + count);
    }
}

    
