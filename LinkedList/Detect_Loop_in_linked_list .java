Que -> Given a linked list of N nodes. The task is to check if the linked list has a loop. Linked list can contain self loop.

class Solution {
  
    public static boolean detectLoop(Node head){
        Node fast = head;
        Node slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) return true;
        }
        
        return false;
    }
}
