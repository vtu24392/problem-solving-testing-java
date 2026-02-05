//Lapindromes

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            int mid = n / 2;

            int[] freq = new int[26];

            // first half
            for (int i = 0; i < mid; i++) {
                freq[s.charAt(i) - 'a']++;
            }

            // second half (skip middle if odd)
            int start = (n % 2 == 0) ? mid : mid + 1;

            for (int i = start; i < n; i++) {
                freq[s.charAt(i) - 'a']--;
            }

            boolean isLapindrome = true;
            for (int count : freq) {
                if (count != 0) {
                    isLapindrome = false;
                    break;
                }
            }

            System.out.println(isLapindrome ? "YES" : "NO");
        }
    }
}
