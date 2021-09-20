Que -> Given a binary tree. Find the size of its largest subtree that is a Binary Search Tree.
       Note: Here Size is equal to the number of nodes in the subtree.
         
         
class Solution{
    
    // Return the size of the largest sub-tree which is also a BST
      public static class BST{
        int min;
        int max;
        boolean isBST;
        int size;
       BST(){
            min = Integer.MAX_VALUE;
            max = Integer.MIN_VALUE;
            isBST = true;
            size = 0;
            
       }
    }
    
    static BST LargestBST(Node root){
        if(root == null){
            return new BST();
        
        }
        
        BST left = LargestBST(root.left);
        BST right = LargestBST(root.right);
        
        BST curr = new BST();
        
        if(left.isBST == false || right.isBST == false || (left.max >= root.data || right.min <= root.data)) 
            {
                curr.isBST = false;
                curr.size = Math.max(left.size,right.size);
                return curr;
            }
            
        curr.size = left.size + right.size + 1;
        curr.min = root.left != null ? left.min : root.data;
        curr.max = root.right != null ? right.max : root.data;
       
        return curr;
    }
    static int largestBst(Node root)
    {
        BST res = LargestBST(root);
        return res.size;
    }
}
