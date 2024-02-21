/**
 * InnerBinarySearchCharactre
 * Q: Find the smallest letter greater than target
 * The array will be in asccending order
 * ex: arr=['a','f', 'i','k','l']; target='i'
 * output: 'k'
 */
public class BinarySearchCharacter {

    static char[] arr = { 'c', 'b', 'f', 'k', 'l', 'n' };

    static int search(int left, int right, char target) {

        if (left <= right) {
            int mid = left + (right - left) / 2;

            if ((int) target < (int) arr[mid]) {
                return search(left, mid - 1, target);
            } else {
                return search(mid + 1, right, target);
            }
        }
        return left == arr.length ? 0 : left;
    }

    public static void main(String[] args) {
        char target = 'z';
        System.out
                .println("Index : " + search(0, arr.length - 1, target) + " Result: "
                        + arr[search(0, arr.length - 1, target)]);
    }

}