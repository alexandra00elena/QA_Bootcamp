public class Toilet extends Room {

    public Toilet() {
        super(RoomType.Toilet);
    }

    @Override
    public String toString(int index) {
        return super.toString(index) + "\n"; // Afișează tipul cu index
    }
}