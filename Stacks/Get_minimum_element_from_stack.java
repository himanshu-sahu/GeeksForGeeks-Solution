Que -> You are given N elements and your task is to Implement a Stack in which you can get minimum element in O(1) time.

class GfG
{
    int minEle;
    Stack<Integer> s = new Stack<Integer>();

    /*returns min element from stack*/
    int getMin()
    {
    	if(s.isEmpty()) return -1;
    	return minEle;
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	
    	if(s.isEmpty()) return -1;
    	
    	else if(s.peek()>=minEle){
    	    return s.pop();
    	}
    	else {
    	    int a = minEle;
    	    minEle=(2*minEle-s.peek());
    	    s.pop();
    	    return a;
    	}
    }

    /*push element x into the stack*/
    void push(int x)
    {
    	if(s.isEmpty()){
    	    s.push(x);
    	    minEle=x;
    	    
    	}
    	else if(minEle<=x) {
    	    s.push(x);
    	}
    	else{
    	    int a=2*x-minEle;
    	    s.push(a);
    	    minEle=x;
    	    
    	}
    }	
}
