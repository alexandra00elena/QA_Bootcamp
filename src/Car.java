import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class Car {

    @Getter @Setter
    private String model;
    @Getter @Setter
    private String color;
    @Getter @Setter
    private String carType;
    private final double MAX_SPEED = 100;
    private double currentSpeed;
    private float cylinderCapacity;
    private float currentMileage;
    private double carPosition;             // compared to magnetic north
    private final int MAX_GEAR = 6;
    private int currentGear;

    public Car(String model, String color, String carType, float cylinderCapacity, double carPosition) {
        this.model = model;
        this.color = color;
        this.carType = carType;
        this.cylinderCapacity = cylinderCapacity;
        this.carPosition = carPosition;
    }

    public void startCar(){
        currentGear = 1;
        currentSpeed = 5;
    }

    public void steerLeft(float angle){
        carPosition -= angle;
    }

    public void steerRight(float angle){
        carPosition += angle;
    }

    public void stopCar(){
        currentSpeed = 0;
        currentGear = 0;
    }

    public void increaseMileage(float mileage){
        currentMileage += mileage;
    }

    public void accelerate(double speedDelta){
        if (currentSpeed + speedDelta > MAX_SPEED){
            currentSpeed = MAX_SPEED;
        }
        else {
            currentSpeed += speedDelta;
        }
    }

    public void decelerate(double speedDelta){
        if (currentSpeed - speedDelta < 0){
            currentSpeed = 0;
        }
        else {
            currentSpeed -= speedDelta;
        }
    }

    public void gearUp() {
        if (currentGear < MAX_GEAR) {
            currentGear++;
        }
    }

    public void gearDOWN() {
        if (currentGear > 0) {
            currentGear--;
        }
    }

    public void setSpeed(int speed) {
        if (speed > MAX_SPEED) {
            System.out.println("Invalid speed of " + speed);
        } else {
            currentSpeed = speed;
        }
    }

    public double getSpeed() {
        return currentSpeed;
    }

    public void printCar(){
        System.out.println("-------------------------");
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Type: " + carType);
        System.out.println("Car Position (based on North): " + carPosition);
        System.out.println("Car Speed: " + currentSpeed);
        System.out.println("Car Gear: " + currentGear);
        System.out.println("Car Mileage: " + currentMileage);
    }
}
