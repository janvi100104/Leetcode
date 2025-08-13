class Solution {
     
    public int findNumbers(int[] nums) {
        int count =0;
        for(int num : nums){
          if(even(num)){
            count++;
          }
        }
        return count;}
        
     public boolean even(int num) {
      int numberOfDigits = digits2(num) ;
      if(numberOfDigits % 2 == 0){
        return true;
      }
      return false;
    }
     static int digits2(int num) {
        return (int) (Math.log10(num))+1;
    }
    static int digits(int num){
       int count = 0;
       while (num>0){
          count++;
         num=num/10;
}
return count;

    }

    }




    
     
    
