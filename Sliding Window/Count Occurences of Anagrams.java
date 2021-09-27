Que -> Given a word pat and a text txt. Return the count of the occurences of anagrams of the word in the text.


class Solution {

    int search(String pat, String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       int final_count = 0;
       
       for(char c : pat.toCharArray()){
           map.put(c,map.getOrDefault(c,0)+1);
          }
        
        int count = map.size();
        int k = pat.length();
        int i=0;
        int j=0;
        while(j < s.length()){
            char ch = s.charAt(j);
            
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch) == 0) 
                   count--;
            }
               
           if(j-i+1 < k){
               j++;
           }
           else if(j-i+1 == k){
               if(count == 0) 
                    final_count++;
               char lastChar = s.charAt(i);
               
               if(map.containsKey(lastChar)){
                    if(map.get(lastChar) == 0) count++;
                    map.put(lastChar,map.get(lastChar)+1);
                }
               
               i++;
               j++;
           }
        }
        
        return final_count;
    }
}
