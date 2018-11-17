package countPrime;

import largestPrimeFactor.LargestPrimeFactor;

public class CountPrime {

    private static int MAX = 10001;

    private CountPrime() {

    }

    public static long get10001PrimeFactor() {
         long result = 2;
         int counter = 0;
         while(counter < MAX) {
             if (LargestPrimeFactor.isPrimeFactor(result)) {
                 counter++;
                 if (counter == MAX) {
                     break;
                 }
             }
             result++;
         }
         return result;
    }

    public static void main(String[] args) {
        System.out.println(get10001PrimeFactor());
    }

}
