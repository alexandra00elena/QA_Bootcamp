public class ObjectCourse {

    public static void main(String[] args) {
        Car vwPassat = new Car();

//        Car dacia1300 = new Car();
        Car dacia1300 = new Car("Dacia 1300", "red", "Sedan", 1300, 45);
        dacia1300.printCar();

/*
        dacia1300.color = "red";
        dacia1300.carType = "Sedan";
        dacia1300.cylinderCapacity = 1300;
        dacia1300.model = "Dacia 1300";
        dacia1300.carPosition = 45;
*/

        dacia1300.startCar();
        dacia1300.accelerate(20);
        dacia1300.gearUp();
        dacia1300.steerRight(45);
        dacia1300.increaseMileage(5);
        dacia1300.stopCar();

        dacia1300.setSpeed(5000);
        System.out.println(dacia1300.getSpeed());

        dacia1300.printCar();

        Square squareabcd = new Square();
        squareabcd.setSquareSide(5);
        squareabcd.printCurrentSquare();

        for (String value : args)
        {
            Square cmdSquare = new Square();
            cmdSquare.setSquareSide(Double.parseDouble(value));
            cmdSquare.printCurrentSquare();
//            Square.printSquare(cmdSquare);
            Utils.printSquare(cmdSquare); /// static method
        }

        Rectangle rectangle = new Rectangle(5, 10) ;
        System.out.println("area is " + rectangle.getArea() + " diagonal is " + rectangle.getDiagonal() +
                " perimeter is" + rectangle. getPerimeter());
    }

}
