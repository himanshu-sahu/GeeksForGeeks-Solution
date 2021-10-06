Que -> Given a Binary Tree, print the diagonal traversal of the binary tree.
       Consider lines of slope -1 passing between nodes. Given a Binary Tree, 
       print all diagonal elements in a binary tree belonging to same line.

class Tree
{
     public ArrayList<Integer> diagonal(Node root)
      {
           ArrayList<Integer> res = new ArrayList<>();
           Queue<Node> q = new LinkedList<>();
           q.offer(root);
           while(!q.isEmpty()){
               int size = q.size();
               for(int i=0;i<size;i++){
                   Node curr = q.poll();
                   while(curr != null){
                       res.add(curr.data);
                       if(curr.left != null)
                            q.add(curr.left);
                        curr = curr.right;    
                   }
               }
           }
           return res;
      }
}
