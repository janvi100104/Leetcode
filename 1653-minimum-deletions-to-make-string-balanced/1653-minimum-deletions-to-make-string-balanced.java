class Solution {
    public int minimumDeletions(String s) {
    //     int count = 0;
    // Stack<Character> stk = new Stack<>(); 
    // for(int i =0;i<s.length();i++){
    //     if(!stk.isEmpty() && s.charAt(i)=='a' && stk.peek()=='b'){
    //         stk.pop();
    //     count++;
    //     }
    //     stk.push(s.charAt(i));
    // }
    // return count;
 
  int n = s.length();
        
        int[] leftB = new int[n + 1];
        int[] rightA = new int[n + 1];
    
    // count number of 'b' to the left of each index
for (int i = 0; i < n; i++) {
    leftB[i + 1] = leftB[i];
    if (s.charAt(i) == 'b') {
        leftB[i + 1]++;
    }
}

// count number of 'a' to the right of each index
for (int i = n - 1; i >= 0; i--) {
    rightA[i] = rightA[i + 1];
    if (s.charAt(i) == 'a') {
        rightA[i]++;
    }
}
    
        int min = Integer.MAX_VALUE;

        // Try all split positions
        for (int i = 0; i <= n; i++) {
            min = Math.min(min, leftB[i] + rightA[i]);
        }

        return min;
    }
}