package taxesTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import taxes.USNEarnings;

import java.util.stream.Stream;

public class USNEarningsTest {

    USNEarnings usnEarnings;
    @BeforeEach
    public void Test(){
        usnEarnings = new USNEarnings();
    }

    @ParameterizedTest
    @MethodSource("usnParams")
    public void setUsnEarningsTest(int expected, int debit, int credit){
        //act
        int result = usnEarnings.calcTaxFor(debit,credit);
        //assert
        Assertions.assertEquals(expected, result);
    }
    public static Stream<Arguments>usnParams(){
        return Stream.of(
                Arguments.of(9,150,0),
                Arguments.of(6,100,0),
                Arguments.of(15,250,70)
        );
    }

}
