package largestPalindrome;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class LargestPalindromeTest {

    @Test
    public void checkLargestPalindrome() {
        Assertions.assertThat(LargestPalindrome.getLargestPalindrome(2)).isEqualTo(9009);
        Assertions.assertThat(LargestPalindrome.getLargestPalindrome(3)).isEqualTo(906609);
    }
}
