package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MaxWinsubstring {

	public static String minWindowSubstring(String s, String t) {
		
		Map<Character,Integer> Smap = new HashMap<>();
		Map<Character,Integer> Tmap = new HashMap<>();
		
		for(char ch : t.toCharArray())
		{
			Tmap.put(ch,Tmap.getOrDefault(ch,0)+1);
		}
		int i=0;
		int j=0;
		int start=0;
		int minlen=Integer.MAX_VALUE;
		int matchcount=0;
	    int required = Tmap.size();
	    while(j<s.length())
	    {
	    	char endchar = s.charAt(j);
	    	Smap.put(endchar,Smap.getOrDefault(endchar, 0)+1);
	        
	    	if(Tmap.containsKey(endchar)&&Smap.get(endchar).intValue()==Tmap.get(endchar).intValue())
	    	{
	    		matchcount++;
	    	}
	    	
	    	//try to shrinkwindow
	    	while(matchcount==required)
	    	{
	    		if(j-i+1<minlen)
	    		{
	    			minlen=j-i+1;
	    			start=i;
	    		}
	    		char startchar = s.charAt(i);
	    		Smap.put(startchar,Smap.get(startchar)-1);
	    		if(Tmap.containsKey(startchar)&& Smap.get(startchar).intValue() < Tmap.get(startchar).intValue())
		    	{
		    		matchcount--;
		    	}
	    		i++;
	    	}
	    	j++;
	
	    }
		return minlen ==Integer.MAX_VALUE ? "": s.substring(start,start+minlen) ;
		
	}

	public static void main(String[] args) {
    	String s = "time to practice";
	    String t = "toc";
//		String s = "totmtaptat";
//		String t = "tta";
		String result = minWindowSubstring(s, t);
		System.out.println("Smallest window substring: " + result);  // Output: "to prac"
	}
}
