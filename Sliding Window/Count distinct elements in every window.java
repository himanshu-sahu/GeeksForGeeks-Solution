Que -> Given an array of integers and a number K. Find the count of distinct elements in every window of size K in the array.

class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(j < n){
            map.put(arr[j],map.getOrDefault(arr[j],0)+1);
            if(j-i+1 < k){
                j++;
            }else {
                res.add(map.size());
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i]) == 0)
                    map.remove(arr[i]);
                i++;
                j++;
            }
        }
        return res;
    }
}
