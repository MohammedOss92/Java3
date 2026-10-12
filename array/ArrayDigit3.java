public class ArrayDigit3 {

    public static void main(String args[]) {

        int[] numbers = {10, 25, 41, 7, 100, 32};

        int count1 = 0;

        for (int i = 0; i < numbers.length; i++) {

            int number = numbers[i];
            boolean found = false;

            while (number != 0) {

                int digit = number % 10;

                if (digit == 1) {
                    count1++;
                    found = true;
                }

                number = number / 10;
            }

            if (found) {
                System.out.println(numbers[i]);
            }
        }

        for (int i = 0; i < count1; i++) {
            System.out.println(1);
        }
    }
}