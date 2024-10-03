/// 2. Display all the prime numbers lower than 1 000 000. Name the class (and java file) PrimeNumbers
/// Alexandra-Elena Pribagu
/// 03.10.2024

public class PrimeNumbers {

    public static void main(String[] args) {
        for (int i = 2; i <= 1000000; i++)
        {
            boolean isPrime = true;
            if (i > 2 && i % 2 == 0)
                isPrime = false;
            else {
                for (int j = 3; j < i; j+=2) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
            }

            if (isPrime)
                System.out.println("Number " + i + " is prime");
        }
    }

}
