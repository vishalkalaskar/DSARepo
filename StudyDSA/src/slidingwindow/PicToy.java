package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class PicToy {
	
	public static int toymethod(String s,int k)
	{
		int i=0;
		int j=0;
		int maxlen =0;
		Map<Character,Integer> map = new HashMap<>();
		while(j<s.length())
		{
			char ch = s.charAt(j);
			map.put(ch,map.getOrDefault(ch,0)+1);
			
			if(map.size()<k)
			{
				j++;
			}
			else if(map.size()==k)
			{
				maxlen = Math.max(maxlen,j-i+1);
				j++;
			}
			else if(map.size()>k)
			{
				while (map.size() > k) {
                    char leftChar = s.charAt(i);
                    map.put(leftChar, map.get(leftChar) - 1);
                    if (map.get(leftChar) == 0) {
                        map.remove(leftChar);
                    }
                    i++;
                }
				j++;
			}
		}
		return maxlen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abaccab";
		int k = 2;
		int maxlen = toymethod(s,k);
		System.out.println("this maximum"+k+"type of toy "+maxlen);

	}

}
