Que -> Given a Binary Tree of size N, find all the nodes which don't have any sibling. Root node can not have a sibling.

class Tree
{
    ArrayList<Integer> res = new ArrayList<>();
    ArrayList<Integer> noSibling(Node node)
    {
        solve(node);
        if(res.size() == 0) res.add(-1);
        Collections.sort(res);
        return res;
    }
    
    void solve(Node root){
        if(root == null) return;
        
        solve(root.left);
        if(root.left == null && root.right != null)
            res.add(root.right.data);
        if(root.left != null && root.right == null)
            res.add(root.left.data);
            
        solve(root.right);    
    }
}
