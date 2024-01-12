class Solution {
    public boolean isPalindrome(String s) {
        s =  s.toLowerCase();
        s =  s.replaceAll("[^a-zA-Z0-9]", "");
        
        if (s.length() == 0) {
            return true;
        }
        
        // Using two pointer approach (keep track of each side)
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}