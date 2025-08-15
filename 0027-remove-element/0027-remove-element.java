class Solution {
    public int removeElement(int[] nums, int val) {
      int count=0;
      for(int fast =0;fast<nums.length;fast++){
        if(val != nums[fast]){
            nums[count]=nums[fast];
            count++;
        }
      }
      return count;  
    }
}