import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter @Setter
public class Floor {
    public Map<RoomType, List<Room> > rooms;

    public Floor() {
        rooms = new HashMap<>();
        for (RoomType type : RoomType.values()) {
            rooms.put(type, new ArrayList<>());
        }
    }

    public void addRoom(Room room) {
        rooms.get(room.getRoomType()).add(room);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();

        for (RoomType roomType : RoomType.values()) {
            List<Room> roomList = rooms.get(roomType);
            if (!roomList.isEmpty()) {
                str.append("\t\t");
                str.append(roomList.size()).append(" ").append(roomType.toString());
                str.append(roomList.size() > 1 ? "s:\n" : ":\n");

                int i = 1; // Contor pentru camere
                for (Room room : roomList) {
                    str.append("\t\t\t").append(room.toString(i)).append("\n"); // Apelăm toString() din fiecare clasă de bază cu index
                    i++;
                }
            }
        }
        return str.toString();
    }
}