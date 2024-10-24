import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Room {

    private RoomType roomType;

    public Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public String toString(int index) {
        return "\t" + roomType.toString() + " " + index;
    }

}

