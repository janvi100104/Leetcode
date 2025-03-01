class Solution {
    public int[] applyOperations(int[] nums) {
        int[] modified = new int[nums.length];
        int zerocount = 0;
        for(int i = 0;i<nums.length-1;i++){
            if (nums[i]==nums[i+1] && nums[i] !=0){
                nums[i] *= 2;
                nums[i+1]= 0;
            }
        }
        for(int num:nums){
            if(num != 0){
             modified[zerocount++]=num;
            }
        }
        while(zerocount<nums.length){
            modified[zerocount++] = 0;
        }
        return modified;
    }
}