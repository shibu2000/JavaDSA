/**
 * CeilingValue : smallest element in array >= target
 * using Binary Search Algorithm
 */
public class CeilingValue {

    static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                return binarySearch(arr, left, mid - 1, target);
            }
            if (target > arr[mid]) {
                return binarySearch(arr, mid + 1, right, target);
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 7, 11, 13 };
        int target =9;

        System.out.println(arr[binarySearch(arr, 0, arr.length - 1, target)]);
    }

}