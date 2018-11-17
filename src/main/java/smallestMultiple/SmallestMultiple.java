package smallestMultiple;

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {

    private SmallestMultiple() {

    }

    public static long getSmallestMultiple(int n) {
        long max = n * 2;
        long result = 0;
        long index = max;
        while (true) {
            boolean isMultipe = true;
            for (int i = 1; i < n; i++) {
                if (max % i != 0) {
                    isMultipe = false;
                    break;
                }
            }
            if(isMultipe) {
                result = max;
                break;
            }
            index++;
            max = n * index;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getSmallestMultiple(20));
    }
}
