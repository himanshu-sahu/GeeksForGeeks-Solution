Que -> Given a Binary Tree (BT), convert it to a Doubly Linked List(DLL) In-Place. 
       The left and right pointers in nodes are to be used as previous and next pointers respectively in converted DLL. 
       The order of nodes in DLL must be same as Inorder of the given Binary Tree. The first node of Inorder traversal (leftmost node in BT) must be the head node of the DLL.

class Solution
{
   
    Node head = null;
    Node prev = null;
    Node bToDLL(Node root)
    {
	    helper(root);
	    return head;
    }
    
    void helper(Node root){
        if(root == null) return;
        
        helper(root.left);
        if(head == null){
            head = root;
            prev = root;
        }else{
            prev.right = root;
            root.left = prev;
            prev = prev.right;
        }
        helper(root.right);
    }
}
