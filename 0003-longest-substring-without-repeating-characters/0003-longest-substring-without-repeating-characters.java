// class Solution {
//     public int lengthOfLongestSubstring(String s) {
        
//     }
// }
// import java.util.HashSet;
// import java.util.Set;

class Solution {
    /**
     * APPROACH 1: Brute Force (Optimized)
     * Time: O(N^2) - Two nested loops.
     * Space: O(k) - Size of the HashSet, where k is min(N, M) [M=charset size].
     */
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        // Outer loop 'i' iterates through all possible start points
        for (int i = 0; i < n; i++) {
            // 'seen' stores unique characters for the *current* substring starting at 'i'
            Set<Character> seen = new HashSet<>();
            
            // Inner loop 'j' expands the substring from 'i'
            for (int j = i; j < n; j++) {
                char currentChar = s.charAt(j);
                
                if (seen.contains(currentChar)) {
                    // Duplicate found. The substring s[i...j-1] was the max
                    // for *this* starting point 'i'.
                    // We can stop expanding from 'i' and move to i+1.
                    break;
                } else {
                    // No duplicate. Add to set and update max length.
                    seen.add(currentChar);
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
            // The 'seen' set is automatically cleared when the 'i' loop repeats
        }
        return maxLength;
    }
}