class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        
        int reversed = 0;
        
        while (x > reversed) {
            int lastDigit = x % 10;
            reversed = (reversed * 10) + lastDigit;
            x /= 10;
        }
        return (x == reversed) || (x == reversed / 10);
    }
}