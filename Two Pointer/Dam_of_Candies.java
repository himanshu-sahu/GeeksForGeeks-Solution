Que -> Geek wants to make a special space for candies on his bookshelf. 
      Currently, it has N books, each of whose height is represented by the array height[] and has unit width.
      Help him select 2 books such that he can store maximum candies between them by removing all the other books from between the selected books.
      The task is to find out the area between two books that can hold the maximum candies without changing the original position of selected books. 

class Solution 
{ 
	static int maxCandy(int arr[], int n) 
	{ 
	    int i =0;
	    int j = n-1;
	    int max =0;
	    
	    while(i < j){
	        max = Math.max(max,(j - i -1)*Math.min(arr[i],arr[j]));
	        if(arr[i] < arr[j]) i++;
	        else j--;
	    }
	    return max;
	}
}
