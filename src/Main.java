public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(1, 100));

        System.out.println(isOdd(7));

    }

    public static boolean isOdd(int number) {

        if (number < 0) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {

        int sumOfOdds = 0;

        if (start > end || start < 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sumOfOdds += i;
            }
        }
        return sumOfOdds;
    }
}