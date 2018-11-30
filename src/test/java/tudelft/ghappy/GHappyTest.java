package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.chocolate.ChocolateBags;

public class GHappyTest {
    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource({ "a,true", "g,false" })
    public void oneCharacter(String input, boolean expectedResult) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(input);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource({ "aa,true", "ag,false", "ga,false", "gg,true" })
    public void twoCharacters(String input, boolean expectedResult) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(input);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "input={0}, result={1}")
    @CsvSource({ "aaa,true", "aga,false", "agga,true", "ggagg,true", "aggagga,true" })
    public void threeAndMoreCharacters(String input, boolean expectedResult) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(input);
        Assertions.assertEquals(expectedResult, result);
    }
}
