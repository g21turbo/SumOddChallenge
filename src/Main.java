public class Main {




    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));

        System.out.println(isOdd(7));

    }

    // Returns true if a number is odd, returns false if it is not
    public static boolean isOdd(int number) {

        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }


    // Returns the sum of odd numbers within a range
    public static int sumOdd(int start, int end) {

        int sumOfOdds = 0;

        // Validates input numbers
        if (start > end || start < 0) {
            return -1;
        }
        // Loops through specified range
        for (int i = start; i <= end; i++) {
            // Checks for odd numbers
            if (isOdd(i)) {
                // Sums odd numbers found in range
                sumOfOdds += i;
            }
        }
        // Returns the sum of odd numbers
        return sumOfOdds;
    }
}