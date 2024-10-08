public class JavaMethods {

    public static void main(String[] args) {
        System.out.println("Hello 2!");

        float myFloat = myFirstMethod(50, 70);
        System.out.println(myFloat);
        System.out.println("Number is odd ? " + isOddNumber(100));
        printMessage(100);
        printMessage2(100);

        drawFullShape(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        drawShapeOutline(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        drawShapeCorners(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

        drawFullShape(Integer.parseInt(args[0]));
        drawShapeOutline(Integer.parseInt(args[0]));
        drawShapeCorners(Integer.parseInt(args[0]));

        addNumbers(1, 100);
        addNumbers(500f, 600f);
        addNumbers(100.6, 88.45);
    }

    private static void addNumbers(int i, int j) {
        System.out.println("Adding 2 int numbers with sum " + (i+j) );
    }

    private static void addNumbers(float i, float j) {
        System.out.println("Adding 2 float numbers with sum " + (i+j) );
    }

    private static void addNumbers(double i, double j) {
        System.out.println("Adding 2 double numbers with sum " + (i+j) );
    }

    private static void drawShapeCorners(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i == 0 && (j == 0 || j == width - 1)) || (i == height - 1 && (j == 0 || j == width - 1)) )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void drawShapeCorners(int lenght) {
        drawShapeCorners(lenght, lenght);
    }

    private static void drawShapeOutline(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void drawShapeOutline(int lenght) {
        drawShapeOutline(lenght, lenght);
    }

    private static void drawFullShape(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void drawFullShape(int lenght) {
        drawFullShape(lenght, lenght);
    }

    public static float myFirstMethod(float input1, float input2) {
        return input1 + input2;
    }

    public static boolean isOddNumber(int number) {
        return number % 2 != 0;
    }

    public static void printMessage(int number) {
        if (isOddNumber(number)) {
            System.out.println("Number " + number + " is odd!");
        }
        else{
            System.out.println("Number " + number + " is even!");
        }
    }

    public static void printMessage2(int number) {
        String type = isOddNumber(number) ? "odd" : "even";
        System.out.println("Number " + number + " is " + type + "!");
    }

}
