import org.junit.jupiter.api.*;

public class CalculatorTests {

    Calculator c;

    @BeforeAll
    public static void classSetup() {
        System.out.println("Preparing all the tests from the class.");
    }

    @BeforeEach
    public void testSetup() {
        System.out.println("The method runs before each test!");
        c = new Calculator();
    }

    @Test
    public void testAddition01() {
        double result = c.compute(3, 4, "+");
        Assertions.assertEquals(7, result, "Addition failed");
    }

    @Test
    public void testAddition02() {
        Assertions.assertEquals(14.5, c.compute(10, 4.5, "+"), "Addition failed");
    }

    @Test
    public void testInvalidOperator() {
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () ->
        {
            c.compute(5, 7, "ABC");
        }, "Operator not valid.");
    }

    @Test
    public void testDivisionByZero() {
        IllegalArgumentException ex = Assertions.assertThrows(IllegalArgumentException.class, () ->
        {
            c.compute(5, 0, "/");
        }, "Operator not valid.");
    }

    @Test
    public void testSubtraction01() {
        Assertions.assertEquals(10, c.compute(5, -5, "-"), "Subtraction failed");
    }

    @Test
    public void testMultiplication01() {
        Assertions.assertEquals(14, c.compute(7, 2, "*"), "Multiplication failed");
    }

    @Test
    public void testSquareRoot01() {
        Assertions.assertEquals(8, c.compute(64, 0, "SQRT"), "Square root failed");
    }

    @Test
    public void testSquareRoot02() {
        Assertions.assertEquals(Math.sqrt(2), c.compute(2, 0, "SQRT"), "Square root failed");
    }

    //new tests - homework
    @Test
    public void testSubtraction02() {
        Assertions.assertEquals(0, c.compute(-5, -5, "-"), "Substraction failed");
    }

    @Test
    public void testMultiplication02() {
        Assertions.assertEquals(-50, c.compute(10, -5, "*"), "Multiplication failed");
    }

    @Test
    public void testMultiplication03() {
        Assertions.assertEquals(0, Math.abs(c.compute(0, -20, "*")), "Multiplication failed");
    }

    @Test
    public void testDivision01(){
        Assertions.assertEquals(-2, c.compute(10, -5, "/"), "Division failed");
    }

    @AfterEach
    public void cleanTest() {
        System.out.println("Clean after the test.");
    }

    @AfterAll
    public static void cleanClass() {
        System.out.println("Cleanup at the end.");
    }

}
