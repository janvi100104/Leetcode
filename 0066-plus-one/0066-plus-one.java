class Solution {
    public int[] plusOne(int[] digits) {
       for(int i = digits.length-1;i>=0;i--){
        if(digits[i]<9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
       }
       int[] newdigitsarray = new int[digits.length+1];
       newdigitsarray[0]=1;
       return newdigitsarray;
    }
}