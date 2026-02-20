class Solution {
    public String makeLargestSpecial(String s) {
        List<String> specials = new ArrayList<String>();
      int count =0;
      int start =0;
      for(int i =0;i<s.length();i++){
         count += (s.charAt(i) == '1') ? 1 : -1;
         if(count == 0){
            String inner = s.substring(start +1 ,i);
        
            specials.add("1" + makeLargestSpecial(inner) + "0");
            start = i+1;
         }
      }
        Collections.sort(specials, Collections.reverseOrder());
         StringBuilder result = new StringBuilder();
        for (String str : specials) {
            result.append(str);
        }

        return result.toString();
    }
}