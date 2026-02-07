package twopointers;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWORepChar {
    public int solve(String str){
        Set<Character> set=new HashSet<Character>();
        int maxLen=0;
        int l=0;
        for(int r=0;r<str.length();r++){
            while(set.contains(str.charAt(r))){
                set.remove(str.charAt(l));
                l++;
            }
            set.add(str.charAt(r));
            maxLen=Math.max(maxLen,r-l+1);
        }
        return maxLen;
    }
}
