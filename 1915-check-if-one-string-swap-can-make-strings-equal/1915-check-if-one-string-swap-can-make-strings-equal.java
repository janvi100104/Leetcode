class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int k =-1, j =-1;
     int count=0;
    
     for(int i=0;i<s1.length();i++)
     {
        if(s1.charAt(i)!=s2.charAt(i))
        {
           count++;
           if(k==-1)
           k=i;
           else if(j==-1)
           j=i;
        }
     }  
      if(count==0) return true;
        else if(count==2 && s1.charAt(k)==s2.charAt(j) && s1.charAt(j)==s2.charAt(k)){
            return true;
        }


        return false;
    
    }
}