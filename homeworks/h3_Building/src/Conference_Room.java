import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public class Conference_Room  extends Room {

    private Map<String, Integer> furniture;
    private Map<String, Integer> appliances;

    public Conference_Room() {
        super(RoomType.Conference_Room);
        furniture = new HashMap<>();
        appliances = new HashMap<>();
    }

    public Conference_Room(Map<String, Integer> furniture, Map<String, Integer> appliances) {
        super(RoomType.Conference_Room);
        this.furniture = furniture;
        this.appliances = appliances;
    }

    public void addFurniture(String furnitureName, int quantity) {
        this.furniture.put(furnitureName, furniture.getOrDefault(furnitureName, 0) + quantity);
    }

    public void addAppliance(String applianceName, int quantity) {
        this.appliances.put(applianceName, appliances.getOrDefault(applianceName, 0) + quantity);
    }

    @Override
    public String toString(int index) {
        String output = super.toString(index);

        if (!furniture.isEmpty() || !appliances.isEmpty()) {
            output += " has:\n";

            for (Map.Entry<String, Integer> entry : furniture.entrySet()) {
                output += "\t\t\t\t\t - " + entry.getValue() + " " + entry.getKey() + "\n";
            }

            for (Map.Entry<String, Integer> entry : appliances.entrySet()) {
                output += "\t\t\t\t\t - " + entry.getValue() + " " + entry.getKey() + "\n";
            }
        } else {
            output += " is empty.\n";
        }

        return output;
    }

}
