import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FloorTest {

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println(">> Preparing all the tests from the class Floor. <<");
    }

    @Test
    public void testFloorCreation01() {
        Floor floor = new Floor();
        Assertions.assertNotNull(floor);
        System.out.println(floor.toString());
    }

    @Test
    public void testFloorAddRooms01() {
        Floor floor = new Floor();

        Room room1 = new Room(RoomType.Kitchen);
        Room room2 = new Room(RoomType.Kitchen);
        Room room3 = new Room(RoomType.Toilet);
        Room room4 = new Room(RoomType.Office_Space);
        Room room5 = new Room(RoomType.Office_Space);
        Room room6 = new Room(RoomType.Office_Space);
        Room room7 = new Room(RoomType.Conference_Room);

        floor.addRoom(room1);
        floor.addRoom(room2);
        floor.addRoom(room3);
        floor.addRoom(room4);
        floor.addRoom(room5);
        floor.addRoom(room6);
        floor.addRoom(room7);

        Assertions.assertEquals(2, floor.getRooms().get(RoomType.Kitchen).size());
        Assertions.assertEquals(1, floor.getRooms().get(RoomType.Toilet).size());
        Assertions.assertEquals(3, floor.getRooms().get(RoomType.Office_Space).size());
        Assertions.assertEquals(1, floor.getRooms().get(RoomType.Conference_Room).size());
        System.out.println(floor.toString());
    }

    @Test
    public void testFloorAddRooms02() {
        Floor floor = new Floor();

        Kitchen kitchen01 = new Kitchen();
        kitchen01.addAppliance("water dispenser", 3);
        kitchen01.addAppliance("frigde", 1);

        Room kitchen02 = new Kitchen();
        Room toilet = new Room(RoomType.Toilet);

        floor.addRoom(kitchen01);
        floor.addRoom(kitchen02);
        floor.addRoom(toilet);

        System.out.println(floor.toString());
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("-- Cleaning up all the tests from the class Floor. --\n");
    }

}
