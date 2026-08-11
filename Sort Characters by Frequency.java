import java.util.*;

class Solution {
    public String frequencySort(String s) {
        // Count frequency of each character
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Sort characters by decreasing frequency
        List<Character> chars = new ArrayList<>(freq.keySet());

        chars.sort((a, b) -> freq.get(b) - freq.get(a));

        // Build the result
        StringBuilder result = new StringBuilder();

        for (char ch : chars) {
            int count = freq.get(ch);

            for (int i = 0; i < count; i++) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

OUTPUT:
Accepted
Runtime: 2 ms
Input:
"tree"

Output:
"eert"

Expected:
"eert"

