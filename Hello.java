public class Hello {

    public static void main(String[] args) {
        int myFirstVariable = 100;
        int mySecondVariable = 0;
        final int MAX_SIZE = 1000;
        final double PI = Math.PI;

        System.out.println("Hello World");

        System.out.println("Second variable is " + mySecondVariable);

        System.out.println(args[0]);

        int operandLeft = Integer.parseInt(args[0]);
        int operandRight = Integer.parseInt(args[1]);

        System.out.println(operandLeft + operandRight);

        int currentNumber = 1;
        while (currentNumber <= MAX_SIZE) {
            System.out.println("Current number is " + currentNumber);
            currentNumber++;
        }
    }

}
