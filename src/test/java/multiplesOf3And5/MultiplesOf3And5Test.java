package multiplesOf3And5;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class MultiplesOf3And5Test {


    @Test
    public void checkMultiplesOf3And5() {
        Assertions.assertThat(MultiplesOf3And5.multiplesOf3And5(10)).isEqualTo( 23);
        Assertions.assertThat(MultiplesOf3And5.multiplesOf3And5(100)).isEqualTo( 2318);
        Assertions.assertThat(MultiplesOf3And5.multiplesOf3And5(1000)).isEqualTo(  233168);
    }

}
