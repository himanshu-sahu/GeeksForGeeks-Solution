Que -> Suppose there is a circle. There are N petrol pumps on that circle. You will be given two sets of data.
      1. The amount of petrol that every petrol pump has.
      2. Distance from that petrol pump to the next petrol pump.
      Find a starting point where the truck can start to get through the complete circle without exhausting its petrol in between.
      Note :  Assume for 1 litre petrol, the truck can go 1 unit of distance.

        
class Solution
{
    int tour(int petrol[], int distance[])
    {
    	int sum=0,diff = 0,start=0;
    	
    	for(int i=0;i<petrol.length;i++){
    	        sum = sum + petrol[i]-distance[i];
    	        if(sum<0){
    	            start = i+1;
    	            diff+=sum;
    	            sum=0;
    	            
    	        }
    	    }
    	    return (sum+diff)>=0 ? start : -1;
    	}
    }
