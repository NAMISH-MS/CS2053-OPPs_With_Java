// Write a generic method swap() that swaps two elements in an array.


public class SwapUtil { // Main class
    public static <T> void swap(T[] arr, int i, int j){ // Generic method to swap elements
        T temp = arr[i];    // Temporary variable to hold one element
        arr[i] = arr[j];    // Swapping the elements
        arr[j] = temp;  // Assigning the temporary variable to the other position
    }

    public static void main(String[] args){     // Main method to test the swap function
        Integer[] nums = {1, 2, 3, 4, 5};   // Creating an array of Integers
        swap(nums, 0, 2);   // Swapping elements at index 0 and 2
        for(int n : nums) System.out.print(n + " ");  // Displaying the swapped array
    }

}
