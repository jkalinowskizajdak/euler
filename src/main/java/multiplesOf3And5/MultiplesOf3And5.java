package multiplesOf3And5;


/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class MultiplesOf3And5 {

    private static final int THREE = 3;
    private static final int FIVE = 5;

    private MultiplesOf3And5() {

    }

    public static int multiplesOf3And5(int n) {
        if (n <= 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i % THREE == 0 ||  i % FIVE == 0) {
                result = result + i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiplesOf3And5(1000));
    }

}
