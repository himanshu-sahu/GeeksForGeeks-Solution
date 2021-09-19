Que -> Given an integer N, find its factorial.


class Solution {
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        for(int i = 2;i<=N;i++){
            int carry = 0;
            for(int j = 0;j<res.size();j++){
                int temp = res.get(j)*i + carry;
                res.set(j,temp % 10);
                carry = temp / 10;
            }
            while(carry > 0){
                res.add(carry % 10);
                carry /= 10;
            }
        }
        
        Collections.reverse(res);
        return res;
    }
}
