Que -> Given a sorted array. Convert it into a Height balanced Binary Search Tree (BST). Find the preorder traversal of height balanced BST. 
        If there exist many such balanced BST consider the tree whose preorder is lexicographically smallest. 
        Height balanced BST means a binary tree in which the depth of the left subtree and the right subtree of every node never differ by more than 1.

class Solution
{
    int idx = 0;
    int[] res;
    public int[] sortedArrayToBST(int[] nums)
    {
        res = new int[nums.length];
        solve(nums,0,nums.length-1);
        return res;
    }
    
    void solve(int[] nums,int left,int right){
        
        if(left <= right)
        {
           int mid = (left + right)/2;
            res[idx++] = nums[mid];
            
            solve(nums,left,mid-1);
            solve(nums,mid+1,right); 
        }
        
    }
}
