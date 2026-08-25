import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> maxSubarray(List<Integer> arr) {
        int current = arr.get(0);
        int maxSubarray = arr.get(0);

        int maxSubsequence = 0;
        int maxElement = arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);

            current = Math.max(value, current + value);
            maxSubarray = Math.max(maxSubarray, current);

            maxElement = Math.max(maxElement, value);

            if (value > 0) {
                maxSubsequence += value;
            }
        }

        if (maxSubsequence == 0) {
            maxSubsequence = maxElement;
        }

        return Arrays.asList(maxSubarray, maxSubsequence);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = Stream.of(
                bufferedReader.readLine().trim().split(" ")
            ).map(Integer::parseInt).collect(toList());

            List<Integer> result = Result.maxSubarray(arr);

            bufferedWriter.write(
                result.stream()
                    .map(Object::toString)
                    .collect(Collectors.joining(" "))
            );

            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

OUTPUT:
Sample Input:

2
4
1 2 3 4
6
2 -1 2 3 4 -5

Your Output:

10 10
10 11

Expected Output:

10 10
10 11