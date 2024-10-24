import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RoomConferenceRoomTest {

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println(">> Preparing all the tests from the class Conference Room. <<");
    }

    @Test
    public void testConferenceRoomCreation01() {
        Conference_Room conference_room = new Conference_Room();
        Assertions.assertNotNull(conference_room);
        System.out.println(conference_room.toString());
    }

    @Test
    public void testConferenceRoomCreation02() {
        Map<String, Integer> furniture = new HashMap<>();
        furniture.put("Seats", 10);
        Map<String, Integer> appliance = new HashMap<>();
        appliance.put("TV", 2);

        Conference_Room conference_room = new Conference_Room(furniture, appliance);
        Assertions.assertNotNull(conference_room.toString());

        Assertions.assertEquals(10, conference_room.getFurniture().get("Seats"));
        Assertions.assertEquals(2, conference_room.getAppliances().get("TV"));
        System.out.println(conference_room);
    }

    @Test
    public void testConferenceRoomCreation03() {
        Map<String, Integer> furniture = new HashMap<>();
        furniture.put("Seats", 10);
        Map<String, Integer> appliance = new HashMap<>();

        Conference_Room conference_room = new Conference_Room(furniture, appliance);
        Assertions.assertNotNull(conference_room);

        Assertions.assertEquals(10, conference_room.getFurniture().get("Seats"));
        Assertions.assertEquals(Collections.EMPTY_MAP, conference_room.getAppliances());
        System.out.println(conference_room.toString());
    }

    @Test
    public void testConferenceRoomAddFurniture01() {
        Map<String, Integer> furniture = new HashMap<>();
        furniture.put("Seats", 10);
        Map<String, Integer> appliance = new HashMap<>();
        appliance.put("TV", 2);

        Conference_Room conference_room = new Conference_Room(furniture, appliance);
        Assertions.assertNotNull(conference_room);

        Assertions.assertEquals(10, conference_room.getFurniture().get("Seats"));
        Assertions.assertEquals(2, conference_room.getAppliances().get("TV"));

        conference_room.addFurniture("Seats", 25);
        Assertions.assertEquals(35, conference_room.getFurniture().get("Seats"));

        System.out.println(conference_room.toString());
    }

    @Test
    public void testConferenceRoomAddAppliances01() {
        Map<String, Integer> furniture = new HashMap<>();
        furniture.put("Seats", 10);
        Map<String, Integer> appliance = new HashMap<>();
        appliance.put("TV", 2);

        Conference_Room conference_room = new Conference_Room(furniture, appliance);
        Assertions.assertNotNull(conference_room);

        Assertions.assertEquals(10, conference_room.getFurniture().get("Seats"));
        Assertions.assertEquals(2, conference_room.getAppliances().get("TV"));

        conference_room.addAppliance("TV", 3);
        Assertions.assertEquals(5, conference_room.getAppliances().get("TV"));

        conference_room.addAppliance("water dispenser", 4);
        Assertions.assertEquals(4, conference_room.getAppliances().get("water dispenser"));

        System.out.println(conference_room.toString());
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("-- Cleaning up all the tests from the class Conference Room. --\n");
    }

}
