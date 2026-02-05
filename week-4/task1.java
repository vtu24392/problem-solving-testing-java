//Leetcode: 1704. DETERMINE IF STRING HALVES ARE ALIKE

class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int mid = n / 2;

        String first_half = s.substring(0, mid);
        String second_half = s.substring(mid, n);

        int vowelCount1 = 0;
        int vowelCount2 = 0;

        for (int i = 0; i < mid; i++) {
            char c1 = Character.toLowerCase(first_half.charAt(i));
            char c2 = Character.toLowerCase(second_half.charAt(i));

            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u')
                vowelCount1++;

            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u')
                vowelCount2++;
        }

        return vowelCount1 == vowelCount2;
    }
}
