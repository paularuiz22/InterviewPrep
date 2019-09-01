class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int palindrome = 0;
        int remainder = x % 10;
        int divisor = x / 10;
        while (remainder != 0 || divisor != 0) {
            System.out.println("Remainder: " + remainder);
            System.out.println("Divisor: " + divisor);
            palindrome *= 10;
            palindrome += remainder;
            System.out.println("Palindrome: " + palindrome);
            remainder = divisor % 10;
            divisor = divisor / 10;
        }       
        return palindrome == x;
    }
}