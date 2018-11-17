package smallestMultiple;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SmallestMultipleTest {

    @Test
    public void checkSmallestMultiple() {
        Assertions.assertThat(SmallestMultiple.getSmallestMultiple(10)).isEqualTo(2520);
        Assertions.assertThat(SmallestMultiple.getSmallestMultiple(20)).isEqualTo(232792560);
    }

}
