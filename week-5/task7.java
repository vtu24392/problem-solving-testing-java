// Leetcode : 3. LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS

class Solution {
    public int lengthOfLongestSubstring(String s) {

        StringBuffer sb = new StringBuffer();
        int maxLength = 0;

        // KADANE'S ALGORITHM
        for(int i=0; i<s.length(); i++) {
            char letter = s.charAt(i);

            while(sb.indexOf(String.valueOf(letter)) != -1 ) {
                sb.deleteCharAt(0);
            }
            sb.append(letter);
            maxLength = Math.max(maxLength, sb.length());
        }

        return maxLength;
    }
}
