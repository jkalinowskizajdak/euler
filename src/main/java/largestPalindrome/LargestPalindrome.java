package largestPalindrome;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product
of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindrome {

    private LargestPalindrome() {

    }

    public static long getLargestPalindrome(int n) {
        long result = 0;
        int a = 0;
        int b = 0;
        char[] chars = new char[n];
        for (int i = 0; i < n; i++) {
            chars[i] = '9';
        }
        String s = String.valueOf(chars);
        int max = Integer.valueOf(s);
        int min = Integer.valueOf(s.substring(1));
        first: for (int i = max; i > min; i--) {
            for (int j = i; j > min; j--) {
                long  value = i * j;
                String s1 = Long.toString(value);
                String s2 = s1.substring(0, s1.length()/2);
                String reverse = new StringBuilder(s2).reverse().toString();
                String s3 = s1.substring(s1.length()/2, s1.length());
                if (reverse.equals(s3) && value > result) {
                    if (a > i && b > j) {
                        break first;
                    }
                    a = i;
                    b = j;
                    result = value;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPalindrome(2));
        System.out.println(getLargestPalindrome(3));
        System.out.println(isPalindrome("rataatar"));

    }
    public static boolean isPalindrome(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }
        String reverse = new StringBuilder(word).reverse().toString();
        return word.toLowerCase().equals(reverse.toLowerCase());
    }

}
