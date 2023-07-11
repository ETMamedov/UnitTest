import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import taxes.USNDebitMinusCredit;
import taxes.USNEarnings;

import java.util.stream.Stream;

public class CompanyTest {

    Company company;

    @BeforeEach
    void beforeTest(){
        company = new Company("Пятерочка", new USNDebitMinusCredit());
    }
    @Test
    public void applyDealsTest(){
        //arrange
        int expected = 100;
        Deal[] deals = {
                new Sale(100, "хлеб"),
                new Expenditure(150, "лампочка"),
                new Sale(150, "масло")};
        //act
        int result = company.applyDeals(deals);
        //assert
        Assertions.assertEquals(expected, result);
    }
}
