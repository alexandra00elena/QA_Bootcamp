/// Display the number of days in month February from a year between 1900-2016 that is read from keyboard(LE: from arguments)
///        HINT:    A year is a leap year if:
///                     -Is divisible by 4 but not by 100
///                     -Is divisible by 400
/// Name the class (and java file) LeapYear.

/// Alexandra-Elena Pribagu
/// 03.10.2024

public class LeapYear {

    public static void main(String[] args) {

        int year = Integer.parseInt(args[0]);

        if (year >= 1900 && year <= 2016) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is not a Leap Year");
            }
        }
        else {
            System.out.println(year + " is not in range 1900 - 2016!");
        }
    }
}
