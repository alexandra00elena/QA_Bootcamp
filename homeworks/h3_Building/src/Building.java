import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Building {
    public List<Floor> floors = new ArrayList<>();
    public String name;

    public Building(String name) {
        this.name = name;
    }

    public void addFloor(Floor floor) {
        this.floors.add(floor);
    }

    public void addFloors(List<Floor> floors) {
        this.floors.addAll(floors);
    }

    public void printBuilding() {
        System.out.println("Building " + name + " has " + floors.size() + " floor" + (floors.size() > 1 ? "s" : "") + (floors.isEmpty() ? "." : ":"));
        for (int i = 0; i < floors.size(); i++) {
            System.out.println("\t> Floor " + (i + 1) + ":");
            System.out.println(floors.get(i).toString()); // Apelează toString() din fiecare Floor
        }
    }
}
