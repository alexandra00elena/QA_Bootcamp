/// 1. Calculate the sum of the first 100 numbers higher than 0. Name the class (and java file) SumOfNumbers.
/// Alexandra-Elena Pribagu
/// 03.10.2024

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 100; i++)
        {
            sum = sum + i;
        }

        System.out.println("Sum of the first 100 numbers higher than 0 is: " + sum);

    }

}
