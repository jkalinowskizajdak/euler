package largestPrimeFactor;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

public class LargestPrimeFactor {

    private LargestPrimeFactor() {

    }

    public static boolean isPrimeFactor(long n) {
        if (n == 1 || n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        long value = (n / 2) + 1;
        boolean isPrimeFactor = true;
        long index = 2;
        while(true) {
            if (index == value) {
                break;
            }
            if (n % index == 0) {
                isPrimeFactor = false;
                break;
            }
            index++;
        }
        return isPrimeFactor;
    }

    public static long getLargesPrimeFactor(long n) {
        double sqrt = Math.sqrt(n);
        long result = 0;
        long index = 2;
        while (index < sqrt) {
            while (n > 0) {
                if (n % index == 0) {
                    n = n / index;
                    result = index;
                } else {
                    break;
                }
            }
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getLargesPrimeFactor(13195));
        System.out.println(getLargesPrimeFactor(60085147514309L));
    }

}
