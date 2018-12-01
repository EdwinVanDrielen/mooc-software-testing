package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.chocolate.ChocolateBags;

public class CaesarShiftCipherTest {

    @DisplayName("Messages van 1 teken")
    @ParameterizedTest(name = "\"{0} en {1}\" moet {2} geven")
    @CsvSource({ "a,0,a", "a,1,b", "z,1,a", "a,-1,z" })
    public void messagesVan1Teken(String message, int shift, String expectedResult) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("Messages van 2 tekens")
    @ParameterizedTest(name = "\"{0} en {1}\" moet {2} geven")
    @CsvSource({ "aa,0,aa", "aa,1,bb", "ab,1,bc", "yz,1,za", "ab,-1,za" })
    public void messagesVan2Tekens(String message, int shift, String expectedResult) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("Messages van 3 tekens")
    @ParameterizedTest(name = "\"{0} en {1}\" moet {2} geven")
    @CsvSource({ "aaa,0,aaa", "aaa,1,bbb", "abc,3,def", "xyz,3,abc", "abc,-3,xyz" })
    public void messagesVan3Tekens(String message, int shift, String expectedResult) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("Invalid messages")
    @ParameterizedTest(name = "\"{0} en {1}\" moet {2} geven")
    @CsvSource({ "ABC,0,invalid", "123,0,invalid" })
    public void invalidMessages(String message, int shift, String expectedResult) {
        CaesarShiftCipher csc = new CaesarShiftCipher();
        String result = csc.CaesarShiftCipher(message, shift);
        Assertions.assertEquals(expectedResult, result);
    }
}
