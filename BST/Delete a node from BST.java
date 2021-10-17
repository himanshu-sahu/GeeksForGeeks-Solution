Que -> Given a Binary Search Tree and a node value X. Delete the node with the given value X from the BST. 
      If no node with value x exists, then do not make any change. 

class Tree {    
    public static Node deleteNode(Node root, int X) {
   
        if(root == null) return null;
        if(root.data > X){
            root.left = deleteNode(root.left,X);
        }else if(root.data < X){
            root.right = deleteNode(root.right,X);
        }else {
            if(root.left != null && root.right != null){
                int max = maxVal(root.left);
                root.data = max;
                root.left = deleteNode(root.left,max);
                return root;
            }else if(root.left != null){
                return root.left;
            }else if(root.right != null){
                return root.right;
            }else{
                return null;
            }
        }
        return root;
    }
    
    static int maxVal(Node root){
        if(root.right != null) return maxVal(root.right);
        else return root.data;
    }
}
