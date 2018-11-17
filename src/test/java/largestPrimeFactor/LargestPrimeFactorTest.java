package largestPrimeFactor;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LargestPrimeFactorTest {

    @Test
    public void checkPrimeFactor() {
        Assertions.assertThat(LargestPrimeFactor.isPrimeFactor(11)).isTrue();
        Assertions.assertThat(LargestPrimeFactor.isPrimeFactor(23)).isTrue();
        Assertions.assertThat(LargestPrimeFactor.isPrimeFactor(7)).isTrue();
        Assertions.assertThat(LargestPrimeFactor.isPrimeFactor(5)).isTrue();
        Assertions.assertThat(LargestPrimeFactor.isPrimeFactor(1)).isTrue();
        Assertions.assertThat(LargestPrimeFactor.isPrimeFactor(2)).isTrue();
        Assertions.assertThat(LargestPrimeFactor.isPrimeFactor(12)).isFalse();
        Assertions.assertThat(LargestPrimeFactor.isPrimeFactor(21)).isFalse();
        Assertions.assertThat(LargestPrimeFactor.isPrimeFactor(35)).isFalse();
    }


    @Test
    public void checkLargestPrimeFactor() {
        Assertions.assertThat(LargestPrimeFactor.getLargesPrimeFactor(13195)).isEqualTo(29);
        Assertions.assertThat(LargestPrimeFactor.getLargesPrimeFactor(600851475143L)).isEqualTo(6857);
    }


}
