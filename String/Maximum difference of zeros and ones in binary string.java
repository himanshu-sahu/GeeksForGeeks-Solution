Que -> Given a binary string S consisting of 0s and 1s. 
        The task is to find the maximum difference of the number of 0s and the number of 1s (number of 0s – number of 1s) in the substrings of a string.
        Note: In the case of all 1s, the answer will be -1.

class Solution {
    int maxSubstring(String S) {
       
        int count1 = 0;
        int count2 = 0;
        int res = -1;
        for(int i =0;i<S.length();i++){
            if(S.charAt(i) == '1'){
                count1++;
            }else {
                count2++;
            }
            
            if(count1 > count2){
                count1 = count2 = 0;
            }
            res = Math.max(res,count2-count1);
        }
        
        return res == 0 ? -1 : res;
    }
}
