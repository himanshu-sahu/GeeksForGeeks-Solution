Que -> Given below is a binary tree. The task is to print the top view of binary tree. 
       Top view of a binary tree is the set of nodes visible when the tree is viewed from the top

//Solution


//Creating new class so that its object can store present level and present node.
class pair
{
    Node node;
    int hd;
    
    pair(Node n,int d){
        node =n;
        hd=d;
    }
}


class Solution
{
    static ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Queue<pair> q= new LinkedList<pair>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        if(root!=null){
            q.add(new pair(root,0));
        }
        while(!q.isEmpty()){
            pair remove = q.poll();
            Node current = remove.node;
            int hd = remove.hd;
            
            if(!map.containsKey(hd)){
                map.put(hd,current.data);
            }
            if(current.left!=null){
                q.add(new pair(current.left,hd-1));
            }
            if(current.right!=null){
                q.add(new pair(current.right,hd+1));
            }
        }
        for(Map.Entry<Integer,Integer> x : map.entrySet()){
            result.add(x.getValue());
        }
        return result;
    }
}
