package org.importantMedium;

import java.util.HashSet;

class LengthOfLongestSubstring{
    public int lengthOfLongSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}

public class LengthOfLongestSubstringWithoutRepCharMain {
    public static void main(String[] args){
        String s = "aaaabcdbbacdefgh";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        System.out.println("Length of Longest Substring Without Repeating Characters: "+ lengthOfLongestSubstring.lengthOfLongSubstring(s));
    }
}
