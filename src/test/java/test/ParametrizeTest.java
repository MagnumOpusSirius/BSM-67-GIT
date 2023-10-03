package test;

import org.example.parameterize.Parametrize;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParametrizeTest {

    @ParameterizedTest
    @ValueSource(strings = {"racecar", "radar", "able was I ere I saw elba"})
    public void testIsPalindrome(String candidate) {
//        System.out.println("candidate = " + candidate);
        assertTrue(Parametrize.isPalindrome(candidate));
    }
}
