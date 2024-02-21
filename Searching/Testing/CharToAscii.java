package Testing;

public class CharToAscii {
    public static void main(String[] args) {
        char[] arr = { 'A', 'Z' };

        for (char a : arr) {
            System.out.println((int) a);
        }

        for (int i = 65; i <= 122; i++) {
            System.out.print((char) i + " ");
        }
    }
}
