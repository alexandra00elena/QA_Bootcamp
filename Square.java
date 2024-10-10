import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Square {

    public double squareSide;

    public double getArea() {
        return this.squareSide * this.squareSide;
        // return Math.pow(squareSide, 2);
    }

    public void printCurrentSquare() {
        System.out.println("Square with side " + this.squareSide + " has area of " + getArea());
    }
}
