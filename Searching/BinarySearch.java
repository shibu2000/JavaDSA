package Searching;

import java.util.Arrays;

/**
 * BinarySearch
 */
public class BinarySearch {
    static int[] arr = { 2, 3, 5, 7, 8, 9, 21 };
    static int target;

    static int searching(int left, int right) {
        if (left <= right) {
            try {
                int mid = left + (right - left) / 2;
                System.out.println("Left: " + left + "Right: " + right + " mid: " + mid);
                if (target == arr[mid]) {
                    return mid;
                }
                if (target < arr[mid]) {
                    return searching(left, mid - 1);
                }
                return searching(mid + 1, right);
            } catch (Exception e) {
                System.out.println("Handle");
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int left = 0, right = arr.length - 1;
        target = 5;

        int result = searching(left, right);
        System.out.println(result);

        System.out.println(Arrays.binarySearch(arr, target));
    }

}