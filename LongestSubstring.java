Problem: Longest Substring Without Repeating Characters
Overview
This challenge will test your ability to efficiently traverse strings and work with dynamic character sets.

Sample Task
✅Find the length of the longest substring without repeating characters.

Input: "abcabcbb"  
Output: 3 (substring "abc") 
Solution Example
public int lengthOfLongestSubstring(String s) {
    int maxLen = 0, start = 0;
    Map<Character, Integer> charIndexMap = new HashMap<>();
    for (int end = 0; end < s.length(); end++) {
        char c = s.charAt(end);
        if (charIndexMap.containsKey(c)) {
            start = Math.max(start, charIndexMap.get(c) + 1);
        }
        charIndexMap.put(c, end);
        maxLen = Math.max(maxLen, end - start + 1);
    }
    return maxLen;
}
