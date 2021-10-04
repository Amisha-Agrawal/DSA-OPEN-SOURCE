import java.util.*;
// Creating a function for the binary search algorithm
class BinarySearch 
{
	// Returns index of x if it is present in arr[]
	// else we will return -1
	int binarySearch(int arr[], int x)
	{
		int l = 0, r = arr.length - 1;
        	//Looping to the total number of items input by the user
		while (l <= r) 
		{
			int m = l + (r - l) / 2;

			// Check if x is present at mid
			if (arr[m] == x)
				return m;

			// If x greater, ignore left half
			if (arr[m] < x)
				l = m + 1;

			// If x is smaller, ignore right half
			else
				r = m - 1;
		}

		// if we reach here, then element was not present
		return -1;
	}

	// Driver method to test above
	public static void main(String args[])
	{
        	Scanner sc= new Scanner(System.in);
        	System.out.print("Enter the number of elements you want to store: ");  
        	//reading the number of elements that we want to enter   
        	int n= sc.nextInt();
        	//creates an array in the memory of length n  
		int[] arr = new int[n]; 
        	//Looping to the total number of items input by the user
        	for(int i=0; i<n; i++)  
        	{  
            		//reading array elements from the user   
            		arr[i]=sc.nextInt();  
        	} 
        	//we take input for the desired number to be searched
		int x= sc.nextInt();
        	BinarySearch ob = new BinarySearch();
        	//Creating an instance of the function with the user inputs
		int result = ob.binarySearch(arr, x);
		if (result == -1)
            		//if the function returns -1 we print that the element was not found
			System.out.println("Element not present");
		else
            		//else we print the index of the element
			System.out.println("Element found at index " + result);
	}
}
