package org.importantMedium;

import java.util.*;

class GroupAnagramsSolution{
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to store groups of Anagrams
        Map<String, List<String>> map = new HashMap<>();

        //Loop through each string in the input array
        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);

            // If the sorted string is not already a key, add it
            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }
            map.get(sortedStr).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
public class GroupAnagramsMain {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        GroupAnagramsSolution groupAnagramsSolution = new GroupAnagramsSolution();
        List<List<String>> result = groupAnagramsSolution.groupAnagrams(strs);
        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
