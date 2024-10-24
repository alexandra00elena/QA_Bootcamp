import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RoomToiletTest {

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println(">> Preparing all the tests from the class Toilet. <<");
    }

    @Test
    public void testToiletCreation() {
        Toilet t = new Toilet();
        Assertions.assertNotNull(t);
        System.out.println(t.toString());
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("-- Cleaning up all the tests from the class Toilet. --\n");
    }

}
