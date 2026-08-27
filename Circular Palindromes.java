import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        String s = br.readLine().trim();

        String doubled = s + s;

        for (int rotation = 0; rotation < n; rotation++) {
            int maxPalindrome = longestPalindrome(
                doubled.substring(rotation, rotation + n)
            );

            System.out.println(maxPalindrome);
        }
    }

    static int longestPalindrome(String s) {
        int max = 1;

        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, expand(s, i, i));
            max = Math.max(max, expand(s, i, i + 1));
        }

        return max;
    }

    static int expand(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}

OUTPUT:
Input (stdin)

13
aaaaabbbbaaaa

Your Output (stdout)

12
12
10
8
8
9
11
13
11
9
8
8
10

Expected Output

12
12
10
8
8
9
11
13
11
9
8
8
10