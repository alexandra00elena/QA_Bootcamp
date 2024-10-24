import java.util.ArrayList;
import java.util.List;

public class Residence {

    public static void main(String[] args) {
        Office_Space officeSpace01 = new Office_Space(20);
        Toilet toilet = new Toilet();

        Kitchen kitchen = new Kitchen();
        kitchen.addAppliance("coffee machine", 1);
        kitchen.addAppliance("water dispenser", 1);
        kitchen.addAppliance("fridge", 1);

        Conference_Room conference_room01 = new Conference_Room();
        conference_room01.addFurniture("seats", 10);
        conference_room01.addAppliance("TV", 1);

        Floor floor01 = new Floor();
        floor01.addRoom(officeSpace01);
        floor01.addRoom(toilet);
        floor01.addRoom(toilet);
        floor01.addRoom(kitchen);
        floor01.addRoom(conference_room01);
        floor01.addRoom(conference_room01);
        floor01.addRoom(conference_room01);


        Office_Space officeSpace02 = new Office_Space(10);

        Conference_Room conference_room02 = new Conference_Room();
        conference_room02.addFurniture("seats", 8);
        conference_room02.addAppliance("TV", 1);

        Floor floor02 = new Floor();
        floor02.addRoom(officeSpace02);
        floor02.addRoom(officeSpace02);
        floor02.addRoom(toilet);
        floor02.addRoom(toilet);
        floor02.addRoom(kitchen);
        floor02.addRoom(conference_room02);
        floor02.addRoom(conference_room02);
        floor02.addRoom(conference_room02);
        floor02.addRoom(conference_room02);


        Conference_Room conference_room03 = new Conference_Room();
        conference_room03.addFurniture("seats", 30);
        conference_room03.addAppliance("Video projector", 1);
        conference_room03.addAppliance("Telepresence", 1);

        Conference_Room conference_room04 = new Conference_Room();
        conference_room04.addFurniture("seats", 20);
        conference_room04.addAppliance("TV", 1);
        conference_room04.addAppliance("Telepresence", 1);

        Conference_Room conference_room05 = new Conference_Room();
        conference_room05.addFurniture("seats", 10);
        conference_room05.addAppliance("TV", 1);
        conference_room05.addAppliance("Telepresence", 1);

        Floor floor03 = new Floor();
        floor03.addRoom(toilet);
        floor03.addRoom(toilet);
        floor03.addRoom(conference_room03);
        floor03.addRoom(conference_room04);
        floor03.addRoom(conference_room05);
        floor03.addRoom(conference_room05);
        floor03.addRoom(conference_room05);
        floor03.addRoom(conference_room05);


        List<Floor> floors = new ArrayList<>();
        floors.add(floor01);
        floors.add(floor02);
        floors.add(floor03);

        Building building01 = new Building("Luna");
        building01.addFloors(floors);

        Building[] buildings = new Building[10];
        buildings[0] = building01;

        for (Building b : buildings) {
            if (b != null) { // Check if b is not null
                b.printBuilding();
                System.out.println("---------------------------------------------\n");
            }
        }
    }
}
