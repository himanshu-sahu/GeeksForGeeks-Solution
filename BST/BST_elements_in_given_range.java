Que. Print BST elements in given range.


class Solution
{   
    //Function to return a list of BST elements in a given range.
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root == null) return res;
        solve(root,res,low,high);
        return res;
    }
    
    
    static void solve(Node root,ArrayList<Integer> res,int low,int high){
        if(root == null) return;
        
        solve(root.left,res,low,high);
        
        if(root.data >= low && root.data <= high){
            res.add(root.data);
        }
        
        solve(root.right,res,low,high);
    }
    
}
