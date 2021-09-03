Que. Given Pointer/Reference to the head of a doubly linked list of N nodes, 
      the task is to Sort the given doubly linked list using Merge Sort in 
      both non-decreasing and non-increasing order.


class LinkedList
{
    
    static Node sortDoubly(Node head)
    {
        if(head == null || head.next == null) return head;
        
        Node fast = head.next;
        Node slow = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        fast = slow;
        slow = slow.next;
        fast.next = null;
        Node first = sortDoubly(head);
        Node second = sortDoubly(slow);
        head = merge(first,second);
        return head;
    }
    
    static Node merge(Node first,Node second){
        if(first == null) return second;
        if(second == null) return first;
        
        if(first.data < second.data){
            first.next = merge(first.next,second);
            first.next.prev = first;
            first.prev = null;
            return first;
        }else{
            second.next = merge(first,second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }
}
