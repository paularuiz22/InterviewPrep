class LongestPalindrome {
    public String longestPalindrome(String s) {
        int longestStart = 0;
        int longestEnd = 0;
        int currentStart = 0;
        while (currentStart < s.length()){
            int currentEnd = currentStart;
            while (currentEnd < s.length()){
                boolean isPalindrome = true;
                for(int i = currentStart, j = currentEnd; i < s.length() && j >= currentStart; i++, j--){
                    if (s.charAt(i) != s.charAt(j)){
                        isPalindrome = false;
                        break;
                    }
                }
                if ((currentEnd - currentStart) > (longestEnd - longestStart) && isPalindrome){
                    longestStart = currentStart;
                    longestEnd = currentEnd;
                }
                currentEnd++;    
            }
            currentStart++;
        }
        if (longestEnd < s.length() - 1){
            return s.substring(longestStart, longestEnd + 1);
        } else {
            return s.substring(longestStart);
        }
    }
}