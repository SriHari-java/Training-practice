class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedNumber = 0;
        while (x > reversedNumber) {
            reversedNumber = reversedNumber * 10 + x % 10;
            x /= 10;
        }

        return x == reversedNumber || x == reversedNumber / 10;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println(solution.isPalindrome(121));  
        System.out.println(solution.isPalindrome(-121)); 
        System.out.println(solution.isPalindrome(10));   
        System.out.println(solution.isPalindrome(0)); 
    }
}

        