package evenFibonaccinNumbers;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.math.BigInteger;

public class EvenFibonacciNumbersTest {

    @Test
    public void checkFibonacci() {
        Assertions.assertThat(EvenFibonacciNumbers.fibonacci(BigInteger.valueOf(4))).isEqualTo(5);
    }

    @Test
    public void checkFibonaciiSum() {
        Assertions.assertThat(EvenFibonacciNumbers.sum()).isEqualTo(BigInteger.valueOf(4613732));
    }
}
