class Solution {
    public void moveZeroes(int[] nums) {
        int unique=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
               nums[unique]=nums[i];
               unique++; 
            }
        }
       if(unique<nums.length){
        for(int i = unique;i<nums.length;i++){
            nums[i]=0;

        }
       } 
    }
}