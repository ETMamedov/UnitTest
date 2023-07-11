package taxesTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import taxes.USNDebitMinusCredit;

import java.util.stream.Stream;

public class USNDebitMinusCreditTest {
    USNDebitMinusCredit usnDebitMinusCredit;
    @BeforeEach
    void beforeTest(){
        usnDebitMinusCredit = new USNDebitMinusCredit();
    }
    @ParameterizedTest
    @MethodSource("DebMinCredParam")
    public void usnDebitMinusCreditTest(int expected, int debit, int credit){
        //act
        int result = usnDebitMinusCredit.calcTaxFor(debit, credit);
        //assert
        Assertions.assertEquals(expected, result);
    }

    public static Stream<Arguments>DebMinCredParam(){
        return Stream.of(Arguments.of(15, 150, 50),
                Arguments.of(0, 100, 150));
    }
}
