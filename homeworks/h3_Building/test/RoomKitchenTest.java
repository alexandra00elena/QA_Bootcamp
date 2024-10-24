import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class RoomKitchenTest {

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println(">> Preparing all the tests from the class Kitchen. <<");
    }

    @Test
    public void testKitchenCreatio01() {
        Kitchen kitchen = new Kitchen();
        Assertions.assertNotNull(kitchen);
        System.out.println(kitchen.toString());
    }

    @Test
    public void testKitchenCreatio02() {
        Map<String, Integer> appliance = new HashMap<>();
        appliance.put("coffee machine", 2);
        appliance.put("water dispenser", 3);
        appliance.put("fridge", 1);

        Kitchen kitchen = new Kitchen(appliance);
        Assertions.assertNotNull(kitchen);
        Assertions.assertEquals(appliance, kitchen.getAppliance());
        System.out.println(kitchen.toString());
    }

    @Test
    public void testKitchenAddAppliance01() {
        Kitchen kitchen = new Kitchen();
        Assertions.assertNotNull(kitchen);

        kitchen.addAppliance("coffee machine", 5);

        Assertions.assertEquals(5, kitchen.getAppliance().get("coffee machine"));
        System.out.println(kitchen.toString());
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("-- Cleaning up all the tests from the class Kitchen. --\n");
    }

}
