Que -> Given a N x N matrix, where every row and column is sorted in non-decreasing order. Find the kth smallest element in the matrix.

class Solution
{
	public static int kthSmallest(int[][]mat,int n,int k)
	{
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                pq.add(mat[i][j]);
                if(pq.size() > k){
                    pq.poll();
                }
            }
        }
        return pq.peek();
    }
}
