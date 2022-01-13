Que -> Given a BST, modify it so that all greater values in the given BST are added to every node.


class Solution{
    
    int res = 0;
    public Node modify(Node root)
    {
        int res = 0;
        sum(root);
        return root;
    }
    
    void sum(Node root){
        if(root == null) return;
        
        sum(root.right);
        res += root.data;
        root.data = res;
        sum(root.left);
    }   
}
