import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TriangleTest {
    private static final Logger logger = LoggerFactory.getLogger(TriangleTest.class);

    @ParameterizedTest
    @CsvSource({"4, 6, 5, 9.921567416492215", "10, 10, 10, 43.30127018922193"})
    void testWithCsvSourcePositive (double a, double b, double c, double s) throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertEquals(Triangle.getTriangleSquare(a,b,c), s);
        logger.info("TestWithCsvSourcePositive completed successfully !");

    }
    @Test
    void testNegativeZero() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class,() -> Triangle.getTriangleSquare(4,0,5));
        logger.info("TestNegativeZero completed successfully !");

    }
    @Test
    void testNegativeMinus() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class,() -> Triangle.getTriangleSquare(4,-6,5));
        logger.info("TestNegativeMinus completed successfully !");

    }
    @Test
    void testSumOfTheTwoSides() throws MyException {
        Triangle triangle = new Triangle();
        Assertions.assertThrows(MyException.class,() -> Triangle.getTriangleSquare(10,3,5));
        logger.info("TestSumOfTheTwoSides completed successfully !");

    }
    }