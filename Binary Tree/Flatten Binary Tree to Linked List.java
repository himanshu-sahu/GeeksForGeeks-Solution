Que-> Given a binary tree, flatten it into linked list in-place. Usage of auxiliary data structure is not allowed. 
       After flattening, left of each node should point to NULL and right should contain next node in preorder.

class Solution {
    public void flatten(TreeNode root) {
        if(root == null) return;
        
        while(root != null){
            if(root.left != null){
                Node temp = root.left;
                while(temp.right != null)
                    temp = temp.right;
                
                temp.right = root.right;
                root.right = root.left;
                root.left = null;
            }
            root = root.right;
        }
    }
}
