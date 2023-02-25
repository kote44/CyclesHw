import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class MonthServiceTest {
    @ParameterizedTest
/*
    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })
*/
    @CsvFileSource(files = "src/test/resources/Vocation.csv")

    void shouldCalculateForMonth(long expected, int income, int expenses, int threshold) {
        MonthService service = new MonthService();
        long actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);

    }
}


