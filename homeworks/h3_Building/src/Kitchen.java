import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Getter @Setter
public class Kitchen extends Room {
    private Map<String, Integer> appliance;

    public Kitchen() {
        super(RoomType.Kitchen);
        this.appliance = new HashMap<>();
    }

    public Kitchen(Map<String, Integer> appliance) {
        super(RoomType.Kitchen);
        this.appliance = appliance;
    }

    public void addAppliance(String appliance, int quantity) {
        this.appliance.put(appliance, quantity);
    }

    @Override
    public String toString(int index) {
        String output = super.toString(index);

        if (!this.appliance.isEmpty()) {
            output += " has:\n";
            for (Map.Entry<String, Integer> entry : this.appliance.entrySet()) {
                output += "\t\t\t\t\t - " + entry.getValue() + " " + entry.getKey() + "\n";
            }
        } else {
            output += " is empty.\n";
        }

        return output;
    }
}
