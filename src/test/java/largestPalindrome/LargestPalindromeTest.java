package largestPalindrome;

import com.google.common.collect.ImmutableMap;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LargestPalindromeTest {

    private static final String KAYAK = "kayak";
    private static final String ALA = "ALA";
    private static final String NOON = "NOON";
    private static final String NONE = "NONE";

    private static Map<String, Boolean> palindromes = ImmutableMap.of( KAYAK, true ,
            ALA, true,
            NOON, true,
            NONE, false);

    @Test
    public void checkLargestPalindrome() {
        Assertions.assertThat(LargestPalindrome.getLargestPalindrome(2)).isEqualTo(9009);
        Assertions.assertThat(LargestPalindrome.getLargestPalindrome(3)).isEqualTo(906609);
    }

    @Test
    public void checkPalindromes() {
        Map<String, Boolean> map = new HashMap<>();
        map.put(KAYAK, LargestPalindrome.isPalindrome(KAYAK));
        map.put(ALA, LargestPalindrome.isPalindrome(ALA));
        map.put(NOON, LargestPalindrome.isPalindrome(NOON));
        map.put(NONE, LargestPalindrome.isPalindrome(NONE));

        Assertions.assertThat(map).isEqualTo(palindromes);
    }
}
