
Que -> Given an array Arr[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of Arr[i] <= Arr[j].
  

class Solution {

    int maxIndexDiff(int arr[], int n) {
        // code here
        
        int[] leftSum = new int[n];     // Array to store min-sum from left side.
        int[] rightSum = new int[n];    // Array to store max-sum from right side.
        
        leftSum[0] = arr[0];
      
      //Store min by comparing two adjacent elements.
        for(int i=1;i<n;i++){
            leftSum[i] = Math.min(arr[i],leftSum[i-1]);
        }
        
      //Store max by comparing two adjacent elements
        rightSum[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightSum[i] = Math.max(arr[i],rightSum[i+1]);
        }
      
        int i =0;
        int j =0;
        int res = -1;
        
        while(i < n && j < n){
            if(leftSum[i] <= rightSum[j]){
                res = Math.max(res,j-i);
                j++;
            }else{
                i++;
            }
        }
        
        return res;
    }
}
