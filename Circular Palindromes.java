import java.util.*;

public class Solution {

    // Function to find longest palindrome length
    public static int longestPalindrome(String s) {
        int maxLen = 1;

        for (int i = 0; i < s.length(); i++) {
            // Odd length
            maxLen = Math.max(maxLen, expand(s, i, i));
            // Even length
            maxLen = Math.max(maxLen, expand(s, i, i + 1));
        }

        return maxLen;
    }

    // Expand around center
    private static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    // Rotate string
    private static String rotate(String s, int k) {
        return s.substring(k) + s.substring(0, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        for (int i = 0; i < n; i++) {
            String rotated = rotate(s, i);
            System.out.println(longestPalindrome(rotated));
        }

        sc.close();
    }
}

OUTPUT:
Input (stdin)
-------------
12
eededdeedede


Your Output (stdout)
-------------------
5
7
7
7
7
9
9
9
9
7
5
4


Expected Output
---------------
5
7
7
7
7
9
9
9
9
7
5
4