class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;

        doubled = doubled.substring(1, doubled.length() - 1);

        return doubled.contains(s);
    }
}

OUTPUT:
Accepted
Runtime: 0 ms

Case 1
Case 2
Case 3

Input
s =
"abab"

Output
true

Expected
true
