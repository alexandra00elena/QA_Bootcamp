import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class BuildingTest {

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println(">> Preparing all the tests from the class Building. <<");
    }

    @Test
    public void testBuildingCreation() {
        Building building = new Building("A");
        Assertions.assertNotNull(building);
        building.printBuilding();
    }

    @Test
    public void testBuildingAddFloor01() {
        Kitchen kitchen01 = new Kitchen();
        kitchen01.addAppliance("water dispenser", 3);
        kitchen01.addAppliance("frigde", 1);

        Room kitchen02 = new Kitchen();
        Room toilet = new Room(RoomType.Toilet);

        Floor floor = new Floor();
        floor.addRoom(kitchen01);
        floor.addRoom(kitchen02);
        floor.addRoom(toilet);

        Building building = new Building("B");
        building.addFloor(floor);

        building.printBuilding();
    }

    @Test
    public void testBuildingAddFloor02() {
        Kitchen kitchen01 = new Kitchen();
        kitchen01.addAppliance("water dispenser", 3);
        kitchen01.addAppliance("frigde", 1);

        Room kitchen02 = new Kitchen();
        Room toilet = new Room(RoomType.Toilet);

        Floor floor1 = new Floor();
        floor1.addRoom(kitchen01);
        floor1.addRoom(kitchen02);
        floor1.addRoom(toilet);

        Office_Space officeSpace1 = new Office_Space();
        officeSpace1.addDesks(10);

        Office_Space officeSpace2 = new Office_Space();
        officeSpace2.addDesks(5);

        Conference_Room conferenceRoom1 = new Conference_Room();
        conferenceRoom1.addAppliance("water dispenser", 3);
        conferenceRoom1.addAppliance("coffee machine", 1);
        conferenceRoom1.addFurniture("TV", 2);


        Floor floor2 = new Floor();
        floor2.addRoom(officeSpace1);
        floor2.addRoom(officeSpace2);
        floor2.addRoom(conferenceRoom1);

        List<Floor> floors = new ArrayList<>();
        floors.add(floor1);
        floors.add(floor2);

        Building building = new Building("A");
        building.addFloors(floors);

        building.printBuilding();
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("-- Cleaning up all the tests from the class Building. --\n");
    }

}
