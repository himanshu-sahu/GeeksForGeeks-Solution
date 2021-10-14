Que -> Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, 
       if the given number is 23 (00010111), it should be converted to 43(00101011). 
       Here, every even position bit is swapped with adjacent bit on the right 
       side(even position bits are highlighted in the binary representation of 23),
       and every odd position bit is swapped with an adjacent on the left side.

class Solution
{
    public static int swapBits(int n) 
    {
	  
	    int odd_mask = 0x55555555;
	    int even_mask = 0xAAAAAAAA;
	    
	    int even = n & even_mask;
	    int odd = n & odd_mask;
	    even >>= 1;
	    odd <<= 1;
	    return even | odd;
	}
    
}
