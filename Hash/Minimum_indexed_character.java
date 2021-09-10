Que -> Given a string str and another string patt. Find the first position 
       (considering 0-based indexing) of the character in patt that is present at the minimum index in str.


class Solution
{
   
    public static int minIndexChar(String str, String patt)
    {
        
        HashSet<Character> hs = new HashSet<>();
        
        for(char c : patt.toCharArray()){
            hs.add(c);
        }
        
        for(int i=0;i<str.length();i++){
            if(hs.contains(str.charAt(i))) return i;
        }
        
        return -1;
    }
}
