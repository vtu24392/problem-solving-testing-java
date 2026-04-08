class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            if (matches(word, pattern)) {
                result.add(word);
            }
        }
        
        return result;
    }
    
    private boolean matches(String word, String pattern) {
        // If lengths differ, they can't match (though constraints usually prevent this)
        if (word.length() != pattern.length()) return false;

        // Use arrays of size 26 for O(1) lookup of lowercase English letters
        int[] pToW = new int[26];
        int[] wToP = new int[26];
        
        for (int i = 0; i < word.length(); i++) {
            char p = pattern.charAt(i);
            char w = word.charAt(i);
            
            // Map characters to 1-indexed values (0 means not yet mapped)
            int pIdx = p - 'a' + 1;
            int wIdx = w - 'a' + 1;
            
            // Check pattern -> word mapping
            if (pToW[pIdx - 1] == 0) {
                pToW[pIdx - 1] = wIdx;
            } else if (pToW[pIdx - 1] != wIdx) {
                return false;
            }
            
            // Check word -> pattern mapping (ensures bijection)
            if (wToP[wIdx - 1] == 0) {
                wToP[wIdx - 1] = pIdx;
            } else if (wToP[wIdx - 1] != pIdx) {
                return false;
            }
        }
        
        return true;
    }
}
