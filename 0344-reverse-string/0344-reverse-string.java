class Solution {
    public void reverseString(char[] s) {
        // Using two pointer approach
        int left = 0;
        int right = s.length - 1;
        
        // Looping to check all the value of array
        while (left <= right) {
            // Assign each value of the array from left into variable temp 
            char temp = s[left];
            
            // Assign the left into right to keep the O(1)
            s[left] = s[right];
            
            // Then, assign temp for the right way of the array
            s[right] = temp;
            
            // Increment the left
            left++;
            
            // Decrement the right
            right--;
        }
    }
}