class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String combined = s + s;

        return combined.contains(goal);
    }
}

OUTPUT:
Accepted
Runtime: 0 ms

Case 1
Case 2

Input
s =
"m"
goal =
"f"

Output
false

Expected
false
