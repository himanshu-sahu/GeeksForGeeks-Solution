Que -> Given a binary tree, find if it is height balanced or not. 
        A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

class Tree
{
    boolean isBalanced(Node root)
    {
        if(root == null) return true;
        int left = height(root.left);
        int right = height(root.right);

        if(Math.abs(right-left) <= 1 && isBalanced(root.right) && isBalanced(root.left)) return true;
        else return false;
    }
    
    int height(Node root){
        if(root == null) return 0;
        int leftH = height(root.left);
        int rightH =height(root.right);
        
        return (1 + Math.max(leftH,rightH));
    }
}
