import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15}; // array
        int k = 3; // find 3rd smallest element

        Arrays.sort(arr); // sort the array

        if (k > 0 && k <= arr.length) {
            System.out.println("Kth smallest element is: " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of k");
        }
    }
}
