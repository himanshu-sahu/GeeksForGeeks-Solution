Que. Count of sum of consecutives.      
      
 class Solution {
    static int getCount(int N) {
       int count = 0;
       int chain_len = 0;
       int sum =0;
       
       while(sum < N){
           chain_len += 1;
           sum += chain_len;
       }
       
       for(double L=1;L<(double)chain_len;L++){
          double a = ((double)N - L * ( L + 1.0) / 2.0)/(L+1.0);
          if(a == (int)a) count += 1;
       }
       
       return count;
    }
};
