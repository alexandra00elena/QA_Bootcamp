import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Office_Space extends Room {
    private int desks;

    public Office_Space() {
        super(RoomType.Office_Space);
        this.desks = 0;
    }

    public Office_Space(int desks) {
        super(RoomType.Office_Space);
        this.desks = desks;
    }

    public void addDesks(int nrDesks) {
        this.desks += nrDesks;
    }

    @Override
    public String toString(int index) {
        String output = super.toString(index);

        if (desks != 0) {
            output += " has:\n";
            output += "\t\t\t\t\t - " + this.desks + " desks\n";
        } else {
            output += " is empty.\n";
        }

        return output;
    }

}
