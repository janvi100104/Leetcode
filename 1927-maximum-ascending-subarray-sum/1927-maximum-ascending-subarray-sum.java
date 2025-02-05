class Solution {
    public int maxAscendingSum(int[] nums) {
    int cur=nums[0];
    int maxval=0;

    for(int i=1;i<nums.length;i++)
      {
        if(nums[i]>nums[i-1]){
            cur+= nums[i];
        }
        else{
         maxval=Math.max(cur,maxval);
           cur=nums[i];
            
        }
      
    }
    return Math.max(cur,maxval);
    }
}
    

    