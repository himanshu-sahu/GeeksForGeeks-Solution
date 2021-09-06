Que -> Given a Binary Tree of size N, you need to find all the possible paths from root node to all the leaf node's of the binary tree.

class Tree{
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    ArrayList<Integer> temp = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> Paths(Node root){
       
        solve(root);
        return res;
    }
    
    void solve(Node root){
        if(root == null){
            return;
        } 
        
        if(root.left == null && root.right == null){
            temp.add(root.data);
            res.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);

            return;
        }
        temp.add(root.data);
        Paths(root.left);
        Paths(root.right);
        temp.remove(temp.size()-1);
    }
    
}
