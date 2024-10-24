import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RoomOfficeSpaceTest {

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println(">> Preparing all the tests from the class Office Space. <<");
    }

    @Test
    public void testOfficeSpaceCreation01() {
        Office_Space officeSpace = new Office_Space();
        Assertions.assertNotNull(officeSpace);
        System.out.println(officeSpace.toString());
    }

    @Test
    public void testOfficeSpaceCreation02() {
        Office_Space officeSpace = new Office_Space(10);
        Assertions.assertNotNull(officeSpace);

        Assertions.assertEquals(10, officeSpace.getDesks());
        System.out.println(officeSpace.toString());
    }

    @Test
    public void testOfficeSpaceAddDesks() {
        Office_Space officeSpace = new Office_Space(10);

        Assertions.assertNotNull(officeSpace);
        Assertions.assertEquals(10, officeSpace.getDesks());

        officeSpace.addDesks(7);
        Assertions.assertEquals(17, officeSpace.getDesks());

        System.out.println(officeSpace.toString());
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("-- Cleaning up all the tests from the class Office Space. --\n");
    }

}
