import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RoomTest {

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println(">> Preparing all the tests from the class Room. <<");
    }

    @Test
    public void testRoomCreationKitchen() {
        Room room = new Room(RoomType.Kitchen);
        Assertions.assertEquals(RoomType.Kitchen, room.getRoomType(), "Kitchen couldn't be created.");
        System.out.println(room.toString());
    }

    @Test
    public void testRoomCreationOfficeSpace() {
        Room room = new Room(RoomType.Office_Space);
        Assertions.assertEquals(RoomType.Office_Space, room.getRoomType(), "Office space couldn't be created.");
        System.out.println(room.toString());
    }

    @Test
    public void testRoomCreationConferenceRoom() {
        Room room = new Room(RoomType.Conference_Room);
        Assertions.assertEquals(RoomType.Conference_Room, room.getRoomType(), "Conference room couldn't be created.");
        System.out.println(room.toString());
    }

    @Test
    public void testRoomCreationToilet() {
        Room room = new Room(RoomType.Toilet);
        Assertions.assertEquals(RoomType.Toilet, room.getRoomType(), "Toilet couldn't be created.");
        System.out.println(room.toString());
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("-- Cleaning up all the tests from the class Room. --\n");
    }
}
