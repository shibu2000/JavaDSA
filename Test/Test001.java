package Test;

public class Test001 {
    static int[] arr = { 2, 3, 5, 7, 8, 9, 21 };
    static int target;

    static int binarySearch(int left, int right) {
        if (left <= right) {
            int mid = left + right / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                return binarySearch(left, mid - 1);
            }
            return binarySearch(mid + 1, right);
        }
        return -1;
    }

    public static void main(String[] args) {
        int left = 0, right = arr.length - 1;
        target = 5;
        int result = binarySearch(left, right);
        System.out.println("Index of " + target + " is: " + result);
    }
    
}
